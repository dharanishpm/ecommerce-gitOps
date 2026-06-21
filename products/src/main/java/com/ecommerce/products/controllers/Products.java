package com.ecommerce.products.controllers;

import com.ecommerce.products.DTO.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class Products {

    @GetMapping("/getProducts")
    public List<ProductResponse> getAllProducts() {
        List<ProductResponse> products = new ArrayList<>();
        ProductResponse product1 = ProductResponse.builder().productId("1").productName("Product 1").price(24.00).stockQuantity(100).build();
        ProductResponse product2 = ProductResponse.builder().productId("2").productName("Product 2").price(24.00).stockQuantity(100).build();
        return List.of(product1, product2);
    }


}
