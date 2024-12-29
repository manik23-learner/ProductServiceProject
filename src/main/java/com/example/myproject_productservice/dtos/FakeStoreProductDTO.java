package com.example.myproject_productservice.dtos;

import com.example.myproject_productservice.models.Category;
import com.example.myproject_productservice.models.Product;

import io.micrometer.core.instrument.Meter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FakeStoreProductDTO {
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Getter
    private String description;
    private long id;
    @Getter
    private double price;
    @Getter
    private String image;
    @Getter
    private String category;
    @Getter
    private String title;


    public Product toProduct() {
        Product product = new Product();
        product.setId(id);
        product.setDescription(getDescription());
        product.setPrice(getPrice());
        product.setTitle(title);
        product.setImageURL(image);

        Category category1 = new Category();
        category1.setTitle(category);
        product.setCategory(category1);

        return product;
    }

    private long getId() {
        return 0;
    }

}
