package com.example.projectdemo.repository;

import com.example.projectdemo.model.Products;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Products , Integer>  {
    @Query(value = "UPDATE PRODUCTS SET NAME = :newName, PRICE = :newPrice, DESCRIPTION = :newDescription WHERE PRODUCT_ID = :productId", nativeQuery = true)
    int updateProductInfo(@Param("productId") Integer productId, @Param("newName") String newName, @Param("newPrice") Double newPrice, @Param("newDescription") String newDescription);
}
