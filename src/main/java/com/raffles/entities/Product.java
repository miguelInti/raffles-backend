package com.raffles.entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduct;

    private String Name;

    private String description;

    @OneToOne
    @JoinColumn(name = "subcategory_id", referencedColumnName = "idSubCategory")
    private SubCategory principalSubcategory;

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
