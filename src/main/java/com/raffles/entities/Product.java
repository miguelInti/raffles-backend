package com.raffles.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "idSubCategory")
    private SubCategory principalSubcategory;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubCategory getPrincipalSubcategory() {
        return principalSubcategory;
    }

    public void setPrincipalSubcategory(SubCategory principalSubcategory) {
        this.principalSubcategory = principalSubcategory;
    }
}
