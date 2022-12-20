package com.raffles.repositories;

import com.raffles.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Long> {
        List<Product> findAll();
}
