package com.example.cp.models;

import com.google.cloud.Timestamp;
import com.google.cloud.firestore.DocumentReference;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class RestPurchaseOrder {
    private Number CVV;
    private Number cardNumber;
    private String lastName;
    private String firstName;
    private String email;
    private Timestamp expirationDate;
    private ArrayList<Items> items = new ArrayList<>();

    public RestPurchaseOrder(Number CVV, Number cardNumber, String lastName, String firstName, Timestamp expirationDate, ArrayList<Items> items) {
        this.CVV = CVV;
        this.cardNumber = cardNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.expirationDate = expirationDate;
        this.items = items;
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

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}
