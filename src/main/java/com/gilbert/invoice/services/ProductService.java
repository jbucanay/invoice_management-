package com.gilbert.invoice.services;

import com.gilbert.invoice.models.Product;
import com.gilbert.invoice.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public Product createProduct(Product product){
        System.out.println(product.toString());
        return productRepo.save(product);
    }
}
