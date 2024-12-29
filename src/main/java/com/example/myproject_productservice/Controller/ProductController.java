package com.example.myproject_productservice.Controller;

import com.example.myproject_productservice.models.Product;
import com.example.myproject_productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class ProductController {
    //Dependency Injection
    private final ProductService productService;
    //Constructor Injection

    public ProductController(@Qualifier("fakeStoreProductService") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/{id}")
    Product getSingleProduct(@PathVariable("id") long id){
        return productService.getSingleProduct(id);
    }
    //Constructor injection

    @GetMapping("/products/")
    List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
