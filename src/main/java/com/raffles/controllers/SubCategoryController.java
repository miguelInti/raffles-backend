package com.raffles.controllers;

import com.raffles.entities.Category;
import com.raffles.entities.SubCategory;
import com.raffles.services.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcategory")
public class SubCategoryController {
    @Autowired
    private SubCategoryService subCategoryService;

    @PostMapping("/saveSubCategory")
    public SubCategory saveSubCategory(@RequestBody SubCategory subCategory) throws Exception{
        return subCategoryService.saveSubCategory(subCategory);
    }

    @GetMapping("/{name}")
    public SubCategory getSubCategory(@PathVariable("name") String name){
        return subCategoryService.getSubCategory(name);
    }

    @GetMapping("/getAll")
    public List<SubCategory> getAllSubCategories(){
        return subCategoryService.getAllSubCategories();
    }

    @DeleteMapping("/{idSubCategory}")
    public void deleteSubCategory(@PathVariable("idSubCategory") Long idSubCategory) {
        subCategoryService.deleteSubCategory(idSubCategory);
    }

    @GetMapping("/getById/{idCategory}")
    public List<SubCategory> getAllSubCategoriesById(@PathVariable("idCategory") Long idCategory){
        return subCategoryService.getAllSubCategoriesById(idCategory);
    }
}
