package com.raffles.services.impl;

import com.raffles.entities.Category;
import com.raffles.repositories.CategoriesRepository;
import com.raffles.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoriesRepository categoriesRepository;
    @Override
    public Category saveCategory(Category category) throws Exception {
        Category localCategory= categoriesRepository.findByCategoryName(category.getCategoryName());
        if (localCategory != null){
            System.out.println("La categoria ya existe");
            throw new Exception("La categoria ya existe");
        }else{
            localCategory = categoriesRepository.save(category);
        }
        return localCategory;
    }

    @Override
    public Category getCategory(String categoryName) {
        return categoriesRepository.findByCategoryName(categoryName);
    }
    @Override
    public List<Category> getAllCategories() {
        return categoriesRepository.findAll();
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoriesRepository.deleteById(categoryId);
    }
}
