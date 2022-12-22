package com.raffles.controllers;

import com.raffles.entities.Product;
import com.raffles.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product) throws Exception{
        return productService.saveProduct(product);
    }

    @GetMapping("/{name}")
    public Product getProduct(@PathVariable("name") String name){
        return productService.getProduct(name);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/{idCategory}")
    public void deleteProduct(@PathVariable("idProduct") Long idProduct) {
        productService.deleteProduct(idProduct);
    }

    @GetMapping("/getById/{idSubCategory}")
    public List<Product> getAllProductsById(@PathVariable("idSubCategory") Long idSubCategory){
        return productService.getAllProductsById(idSubCategory);
    }
}
