package com.example.projectdemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "PRODUCTS")
public class Products {
    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PRODUCT_ID;

    @Column (name = "NAME")
    private String nameProduct;

    @Column(name = "PRICE")
    private Double PRICE;

    @Column(name = "DESCRIPTION")
    private String DESCRIPTION;



}
