package com.gilbert.invoice.controllers;

import com.gilbert.invoice.models.Product;
import com.gilbert.invoice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
}
