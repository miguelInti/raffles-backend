package com.raffles.repositories;

import com.raffles.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {
        List<Category> findAll();

        public Category findByCategoryName(String categoryName);
}
