package com.raffles.services;

import com.raffles.entities.SubCategory;

import java.util.List;

public interface SubCategoryService {
    public SubCategory saveSubCategory(SubCategory subCategory) throws Exception;

    public SubCategory getSubCategory(String name);

    public List<SubCategory> getAllSubCategories();

    public void deleteSubCategory(Long idSubCategory);
}
