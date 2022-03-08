package com.example.demo.controller;

import com.example.demo.dto.CommonResponse;
import com.example.demo.dto.ProductDto;
import com.example.demo.service.ProductService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {
    private final ProductService productService;
    
    //generate constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("")
    public CommonResponse getProducts() {
        //TODO: Add code to get all product list here
        return new CommonResponse("Dummy Products");
    }

    @GetMapping("{id}")
    public CommonResponse getProduct(@PathVariable("id") String id) {
        //TODO: Add code to get product here
        return new CommonResponse("Dummy Product");
    }

    @PostMapping("")
    public CommonResponse addProduct(@RequestBody ProductDto productDto) {
        //TODO: Add code to post here
        productService.add(productDto);
        return new CommonResponse("Successfully add new product");
    }

    @PutMapping("/stock")
    public CommonResponse updateStock() {
        //TODO: Add code to post here
        return new CommonResponse("Successfully update stock");
    }

    @DeleteMapping("{id}")
    public CommonResponse deleteProduct(@PathVariable("id") String id) {
        //TODO: Add code to get product list here
        return new CommonResponse("Successfully delete product");
    }
}
