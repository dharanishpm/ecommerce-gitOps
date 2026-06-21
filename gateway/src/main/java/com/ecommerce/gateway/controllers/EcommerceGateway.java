package com.ecommerce.gateway.controllers;


import com.ecommerce.gateway.DTO.ProductResponse;
import java.util.List;
import com.ecommerce.gateway.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EcommerceGateway {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<ProductResponse> getAllProducts() {
        System.out.println("Controller Hit");
        return productService.getAllProducts();
    }




}
