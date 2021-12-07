package com.example.cp.models;

import com.google.cloud.Timestamp;

import java.util.ArrayList;

public class PurchaseOrder {
    protected String CVV;
    protected String cardNumber;
    protected String lastName;
    protected String firstName;
    protected  String email;
    protected Timestamp expirationDate;
    protected ArrayList<Items> items;


    public PurchaseOrder(String CVV, String cardNumber, String lastName, String firstName, String email, Timestamp expirationDate, ArrayList<Items> items) {
        this.CVV = CVV;
        this.cardNumber = cardNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.expirationDate = expirationDate;
        this.items = items;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
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

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}
