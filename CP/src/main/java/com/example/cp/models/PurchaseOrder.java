package com.example.cp.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PurchaseOrder {
    protected Number poNumber;
    protected LocalDateTime poDate;
    protected LocalDateTime promisedDate;
    protected Address shipTo;
    protected ArrayList<Items> items;
    protected String shippingMethod;
    protected Number freightCost;
    protected Number taxRate;
    protected Number discountRate;
    protected String specialInstructions;
    protected Number invoiceNumber;
    protected String status;
    private User createdBy;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;

    public PurchaseOrder() {
    }

    public PurchaseOrder(Number poNumber, LocalDateTime poDate, LocalDateTime promisedDate, Address shipTo, ArrayList<Items> items, String shippingMethod, Number freightCost, Number taxRate, Number discountRate, String specialInstructions, Number invoiceNumber, String status, User createdBy, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.poNumber = poNumber;
        this.poDate = poDate;
        this.promisedDate = promisedDate;
        this.shipTo = shipTo;
        this.items = items;
        this.shippingMethod = shippingMethod;
        this.freightCost = freightCost;
        this.taxRate = taxRate;
        this.discountRate = discountRate;
        this.specialInstructions = specialInstructions;
        this.invoiceNumber = invoiceNumber;
        this.status = status;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Number getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(Number poNumber) {
        this.poNumber = poNumber;
    }

    public LocalDateTime getPoDate() {
        return poDate;
    }

    public void setPoDate(LocalDateTime poDate) {
        this.poDate = poDate;
    }

    public LocalDateTime getPromisedDate() {
        return promisedDate;
    }

    public void setPromisedDate(LocalDateTime promisedDate) {
        this.promisedDate = promisedDate;
    }

    public Address getShipTo() {
        return shipTo;
    }

    public void setShipTo(Address shipTo) {
        this.shipTo = shipTo;
    }


    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Number getFreightCost() {
        return freightCost;
    }

    public void setFreightCost(Number freightCost) {
        this.freightCost = freightCost;
    }

    public Number getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Number taxRate) {
        this.taxRate = taxRate;
    }

    public Number getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Number discountRate) {
        this.discountRate = discountRate;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    public void setSpecialInstructions(String specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public Number getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Number invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
