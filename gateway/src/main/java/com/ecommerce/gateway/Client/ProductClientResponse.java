package com.ecommerce.gateway.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductClientResponse {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private Integer stockQuantity;

}
