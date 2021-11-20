package com.example.cp.models;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;

import java.util.ArrayList;

public class RestPurchaseOrder {
    private Number poNumber;
    private Timestamp poDate;
    private Timestamp promisedDate;
    private Address shipTo;
    private ArrayList<Items> items;
    private String shippingMethod;
    private Number freightCost;
    private Number taxRate;
    private Number discountRate;
    private String specialInstructions;
    private Number invoiceNumber;
    private String status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private DocumentReference createdBy;



    public Number getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(Number poNumber) {
        this.poNumber = poNumber;
    }

    public Timestamp getPoDate() {
        return poDate;
    }

    public void setPoDate(Timestamp poDate) {
        this.poDate = poDate;
    }

    public Timestamp getPromisedDate() {
        return promisedDate;
    }

    public void setPromisedDate(Timestamp promisedDate) {
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DocumentReference getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(DocumentReference createdBy) {
        this.createdBy = createdBy;
    }


   
}
