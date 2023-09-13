package com.example.projectdemo.service;

import com.example.projectdemo.model.Products;
import com.example.projectdemo.repository.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductsRepo productsRepo;

    @Autowired
    public void setProductsRepo(ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }

    public List<Products> getAllProducts(){
        return productsRepo.findAll();
    }

    public Products addProducts(Products products){
        return productsRepo.save(products);
    }
}
