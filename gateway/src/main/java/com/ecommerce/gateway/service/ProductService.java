package com.ecommerce.gateway.service;

import com.ecommerce.gateway.DTO.ProductResponse;
import com.ecommerce.gateway.feignClient.productFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    productFeign productFeign;

    public List<ProductResponse> getAllProducts() {
        System.out.println("Called Feign Call");
        return productFeign.getAllProducts();
    }

    public List<ProductResponse> getAllProductsByCategoryId() {
        return List.of();
    }
}
