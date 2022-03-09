package com.example.demo.controller;

import com.example.demo.Entity.ProductEntity;
import com.example.demo.dto.CommonResponse;
import com.example.demo.dto.ProductDto;
import com.example.demo.dto.ProductReturnDto;
import com.example.demo.dto.UpdateStockDto;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/product")
public class ProductController {
    private final ProductService productService;
    
    //generate constructor
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

//    @GetMapping("")
//    public List<ProductEntity> getProducts(@RequestParam(value = "Stock", defaultValue = "0") Long isInStock) {
//        return productService.fetch(isInStock);
//    }

    @GetMapping("{id}")
    public ProductReturnDto getProduct(@PathVariable("id") String id) {
        ProductEntity entity = productService.getById(Long.parseLong(id));
        return new ProductReturnDto(entity);
    }

    //get available product under certain price
    @GetMapping("")
    public List<ProductEntity> getByPrice(@RequestParam(value = "Price", defaultValue = "0") Long price) {
        return productService.fetchByPrice(price);
    }


    @PostMapping("")
    public CommonResponse addProduct(@RequestBody ProductDto productDto) {
        productService.add(productDto);
        return new CommonResponse("Successfully add new product");
    }

    @PutMapping("/stock")
    public ProductEntity updateStock(@RequestBody UpdateStockDto request) {
        return productService.updateStock(request);
    }

    @DeleteMapping("{id}")
    public CommonResponse deleteProduct(@PathVariable("id") String id) {
        productService.delete(Long.parseLong(id));
        return new CommonResponse("Successfully delete product");
    }
}
