package com.example.demo.dto;

public class ProductDto {
    private String productName;
    private Long price;
    private Long stock;
    private String desc;

    /**
     * @return String return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return Long return the price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * @return Long return the stock
     */
    public Long getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Long stock) {
        this.stock = stock;
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
