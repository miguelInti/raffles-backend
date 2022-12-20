package com.raffles.controllers;

import com.raffles.entities.Category;
import com.raffles.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saveCategory")
    public Category saveCategory(@RequestBody Category category) throws Exception{
        return categoryService.saveCategory(category);
    }

    @GetMapping("/{categoryName}")
    public Category getCategory(@PathVariable("categoryName") String categoryName){
        return categoryService.getCategory(categoryName);
    }

    @GetMapping("/getAll")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }

    @DeleteMapping("/{idCategory}")
    public void deleteCategory(@PathVariable("idCategory") Long idCategory){
        categoryService.deleteCategory(idCategory);
    }
}
