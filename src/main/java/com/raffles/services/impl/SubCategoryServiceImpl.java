package com.raffles.services.impl;

import com.raffles.entities.SubCategory;
import com.raffles.repositories.SubCategoryRepository;
import com.raffles.services.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryRepository subCategoryRepository;

    @Override
    public SubCategory saveSubCategory(SubCategory subCategory) throws Exception {
        SubCategory localSubCategory = subCategoryRepository.findByName(subCategory.getName());
        if (localSubCategory != null){
            System.out.println("La subcategoria ya existe");
            throw new Exception("La subcategoria ya existe");
        }else{
            localSubCategory = subCategoryRepository.save(subCategory);
        }
        return localSubCategory;
    }

    @Override
    public SubCategory getSubCategory(String name) {
        return subCategoryRepository.findByName(name);
    }

    @Override
    public List<SubCategory> getAllSubCategories() {
       return subCategoryRepository.findAll();
    }

    @Override
    public void deleteSubCategory(Long idSubCategory) {
        subCategoryRepository.deleteById(idSubCategory);
    }
}
