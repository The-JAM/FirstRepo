package com.example.cp.models;

import java.time.LocalDateTime;

public class PurchaseOrder {
    protected Number CVV;
    protected Number cardNumber;
    protected String lastName;
    protected String firstName;
    protected LocalDateTime expirationDate;
    protected User createdBy;

public PurchaseOrder() {
}

public PurchaseOrder(Number CVV, Number cardNumber, String lastName, String firstName, LocalDateTime expirationDate, User createdBy) {
    this.CVV = CVV;
    this.cardNumber = cardNumber;
    this.lastName = lastName;
    this.firstName = firstName;
    this.expirationDate = expirationDate;
    this.createdBy = createdBy;
    }

    public Number getCVV() {
        return CVV;
    }

    public void setCVV(Number CVV) {
        this.CVV = CVV;
    }

    public Number getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Number cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }
}
