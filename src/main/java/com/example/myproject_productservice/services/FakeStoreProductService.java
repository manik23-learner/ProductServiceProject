package com.example.myproject_productservice.services;

import com.example.myproject_productservice.dtos.FakeStoreProductDTO;
import com.example.myproject_productservice.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service("fakeStoreProductService")
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(long id) {
        ResponseEntity<FakeStoreProductDTO> fakeStoreProductDTOResponse = restTemplate.getForEntity("https://fakestoreapi.com/products/" + id,
                FakeStoreProductDTO.class);
        return fakeStoreProductDTOResponse.getBody().toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDTO[] fakeStoreProductDTOS = restTemplate.getForObject("https://fakestoreapi.com/products",
                FakeStoreProductDTO[].class);
        List<Product> products = new ArrayList<>();
        for (FakeStoreProductDTO fakeStoreProductDTO : fakeStoreProductDTOS) {
            products.add(fakeStoreProductDTO.toProduct());
        }
        return products;
    }

    @Override
    public Product createProduct(String title, String description, String image, String category, double price) {
        return null;
    }
}

