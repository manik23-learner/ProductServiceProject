package com.example.myproject_productservice.services;

import com.example.myproject_productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getSingleProduct(long id) ;
     List<Product> getAllProducts();
     Product createProduct(String title,
                           String description,
                           String image,
                           String category,
                           double price);
    }
