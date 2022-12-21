package com.raffles.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "subcategory")
public class SubCategory {

    public SubCategory() {
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSubCategory;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category principalCategory;

    public Long getIdSubCategory() {
        return idSubCategory;
    }

    public void setIdSubCategory(Long idSubCategory) {
        this.idSubCategory = idSubCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getPrincipalCategory() {
        return principalCategory;
    }

    public void setPrincipalCategory(Category principalCategory) {
        this.principalCategory = principalCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
