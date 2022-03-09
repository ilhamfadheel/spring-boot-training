package com.example.demo.repository;

import java.util.List;

import com.example.demo.Entity.ProductEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {
    //JPA Magic
    //JPQL magic
    List<ProductEntity> findByStockGreaterThan(long jumlah);
    //JPA Magic
    List<ProductEntity> findByPriceLessThanEqual(Long price);
}
