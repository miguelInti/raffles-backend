package com.raffles.services;

import com.raffles.entities.Category;

import java.util.List;

public interface CategoryService {
    public Category saveCategory(Category category) throws Exception;

    public Category getCategory(String categoryName);

    public List<Category> getAllCategories();

    public void deleteCategory(Long categoryId);
}
