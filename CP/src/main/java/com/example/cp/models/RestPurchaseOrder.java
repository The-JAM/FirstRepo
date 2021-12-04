package com.example.cp.models;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;

import java.time.LocalDateTime;

public class RestPurchaseOrder {
    private Number CVV;
    private Number cardNumber;
    private String lastName;
    private String firstName;
    private Timestamp expirationDate;
    private DocumentReference createdBy;


    public RestPurchaseOrder(Number CVV, Number cardNumber, String lastName, String firstName, Timestamp expirationDate, DocumentReference createdBy) {
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

    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Timestamp expirationDate) {
        this.expirationDate = expirationDate;
    }

    public DocumentReference getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(DocumentReference createdBy) {
        this.createdBy = createdBy;
    }
}
