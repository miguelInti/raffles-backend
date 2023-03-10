package com.raffles.repositories;

import com.raffles.entities.Product;
import com.raffles.entities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAll();

    public Product findByName(String name);

    List<Product> findByPrincipalSubcategory_idSubCategory(Long idSubCategory);
}
