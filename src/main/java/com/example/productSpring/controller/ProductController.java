package com.example.productSpring.controller;

import com.example.productSpring.domain.Product;
import com.example.productSpring.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping(value = "/product")
public class ProductController {
    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/add")
    public Product add(@RequestParam Product product) {
        return productService.add(product);
    }
}
