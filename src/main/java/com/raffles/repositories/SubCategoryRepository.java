package com.raffles.repositories;

import com.raffles.entities.Category;
import com.raffles.entities.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
    List<SubCategory> findAll();

    public SubCategory findByName(String name);

    List<SubCategory> findByPrincipalCategory_idCategory(Long idCategory);

}
