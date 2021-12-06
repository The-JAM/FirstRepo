package com.example.cp.models;

public class Items {
    private String productName;
    private String gameImageUrl;
    private Double gamePrice;
    private Integer quantity;
    private Double price;

    public Items() {
    }

    public Items(String productName, String gameImageUrl, Double gamePrice, Integer quantity, Double price) {
        this.productName = productName;
        this.gameImageUrl = gameImageUrl;
        this.gamePrice = gamePrice;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getGameImageUrl() {
        return gameImageUrl;
    }

    public void setGameImageUrl(String gameImageUrl) {
        this.gameImageUrl = gameImageUrl;
    }

    public Double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(Double gamePrice) {
        this.gamePrice = gamePrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
