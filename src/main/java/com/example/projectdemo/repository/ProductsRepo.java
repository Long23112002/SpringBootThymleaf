package com.example.projectdemo.repository;

import com.example.projectdemo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Products , Integer>  {
}
