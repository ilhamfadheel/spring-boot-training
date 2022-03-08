package com.example.demo.service;

import com.example.demo.Entity.ProductEntity;
import com.example.demo.dto.ProductDto;
import com.example.demo.repository.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public ProductEntity add(ProductDto request){
        ProductEntity product = new ProductEntity();
        product.setName(request.getProductName());
        product.setStock(request.getStock());
        product.setPrice(request.getPrice());

        //todo: save into db;
        productRepository.save(product);

        return product;
    }

}
