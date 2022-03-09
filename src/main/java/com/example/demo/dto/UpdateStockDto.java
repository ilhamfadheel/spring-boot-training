package com.example.demo.dto;

public class UpdateStockDto {
    private long id;
    private long numberOfStock;
    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return long return the numberOfStock
     */
    public long getNumberOfStock() {
        return numberOfStock;
    }

    /**
     * @param numberOfStock the numberOfStock to set
     */
    public void setNumberOfStock(long numberOfStock) {
        this.numberOfStock = numberOfStock;
    }

}
