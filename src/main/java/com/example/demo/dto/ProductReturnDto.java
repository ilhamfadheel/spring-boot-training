package com.example.demo.dto;

import com.example.demo.Entity.ProductEntity;

public class ProductReturnDto {
    private String name;
    private long stock;
    private long price;
    private String desc;

    //generate constructor
    public ProductReturnDto(ProductEntity entity) {
        this.name = entity.getName();
        this.stock = entity.getStock();
        this.price = entity.getPrice();
        this.desc = entity.getDesc();
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return long return the stock
     */
    public long getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(long stock) {
        this.stock = stock;
    }

    /**
     * @return long return the price
     */
    public long getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(long price) {
        this.price = price;
    }

    /**
     * @return String return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

}
