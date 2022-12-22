package com.raffles.services.impl;

import com.raffles.entities.Category;
import com.raffles.entities.Product;
import com.raffles.repositories.ProductRepository;
import com.raffles.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    
    private ProductRepository productRepository;
    @Override
    public Product saveProduct(Product product) throws Exception {
        Product localProduct= productRepository.findByName(product.getName());
        if (localProduct != null){
            System.out.println("El producto ya existe");
            throw new Exception("El producto ya existe");
        }else{
            localProduct = productRepository.save(product);
        }
        return localProduct;
    }

    @Override
    public Product getProduct(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void deleteProduct(Long idProduct) {
        productRepository.deleteById(idProduct);
    }

    @Override
    public List<Product> getAllProductsById(Long idSubCategory) {
        return productRepository.findByPrincipalSubcategory_idSubCategory(idSubCategory);
    }
}
