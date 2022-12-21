package com.raffles.services;

import com.raffles.entities.Category;
import com.raffles.entities.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product) throws Exception;

    public Product getProduct(String name);

    public List<Product> getAllProducts();

    public void deleteProduct(Long idProduct);
}
