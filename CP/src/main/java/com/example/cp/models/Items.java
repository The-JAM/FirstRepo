package com.example.cp.models;

public class Items {
    private String sku;
    private String productName;
    private Number quantity;
    private Number unitPrice;
    private String unit;

    public Items() {
    }

    public Items(String sku, String productName, Number quantity, Number unitPrice, String unit) {
        this.sku = sku;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.unit = unit;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public Number getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Number unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
