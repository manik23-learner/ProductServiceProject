package com.example.myproject_productservice.services;


import com.example.myproject_productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService {
   public Product getSingleProduct(long id) {
        return null;
    }
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createProduct(String title,
                                 String description,
                                 String image,
                                 String category,
                                 double price) {
        return null;
    }
}


