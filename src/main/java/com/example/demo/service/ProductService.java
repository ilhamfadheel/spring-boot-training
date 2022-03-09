package com.example.demo.service;

import com.example.demo.Entity.ProductEntity;
import com.example.demo.dto.ProductDto;
import com.example.demo.dto.UpdateStockDto;
import com.example.demo.repository.ProductRepository;

import org.hibernate.sql.Delete;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<ProductEntity> fetchAll(){
        return (List<ProductEntity>) productRepository.findAll();
    }

    public void delete(long id){
        productRepository.deleteById(id);
    }

    public ProductEntity getById(long id){
        return productRepository.findById(id).orElse(new ProductEntity());
    }

    public ProductEntity updateStock(UpdateStockDto request){
        ProductEntity product = productRepository.findById(request.getId()).orElse(new ProductEntity());
        product.setStock(product.getStock() + request.getNumberOfStock());
        return productRepository.save(product);
    }

    public List<ProductEntity> fetch(Long isInStock){
        return productRepository.findByStockGreaterThan(isInStock);
    }
}
