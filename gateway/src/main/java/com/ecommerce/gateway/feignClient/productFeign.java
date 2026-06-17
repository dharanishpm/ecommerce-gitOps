package com.ecommerce.gateway.feignClient;

import com.ecommerce.gateway.DTO.ProductResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "product-service", url = "${product.service.url}")
public interface productFeign {

    @GetMapping("/product/getProducts")
    List<ProductResponse> getAllProducts();

}
