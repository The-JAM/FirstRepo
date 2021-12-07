package com.example.cp.controllers;

import com.example.cp.models.Items;
import com.example.cp.models.PurchaseOrder;
import com.example.cp.models.RestPurchaseOrder;
import com.example.cp.services.PurchaseOrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ExecutionException;

@RequestMapping("/api")
@RestController
public class PurchaseOrderRestController {

    public PurchaseOrderService purchaseOrderService;

    @Autowired
    public PurchaseOrderRestController(PurchaseOrderService purchaseOrderService) {this.purchaseOrderService = purchaseOrderService;}

    @PostMapping("/purchaseOrder")
    public String createNewPurchaseOrder(@RequestBody String json) throws JsonProcessingException, ExecutionException, InterruptedException, ParseException {
        Firestore db = FirestoreClient.getFirestore();
        ObjectMapper mapper = new ObjectMapper()
                .registerModule(new ParameterNamesModule())
                .registerModule(new Jdk8Module())
                .registerModule(new JavaTimeModule());

        System.out.println(json);
        JsonNode rootNode = mapper.readTree(json);
        ArrayList<Items> items = mapper.convertValue(rootNode.get("items"), ArrayList.class);
        String firstName = rootNode.get("firstName").asText();
        String lastName = rootNode.get("lastName").asText();
        String email = rootNode.get("email").asText();
        String creditCardNumber = rootNode.get("creditCardNumber").asText();
        String  cvv  = rootNode.get("cvv").asText();
        Date tempDate  = new Date(rootNode.get("expDate").asLong());
        Timestamp expDate = Timestamp.of(tempDate);

        PurchaseOrder tempPurchaseOrder = new PurchaseOrder(cvv, creditCardNumber,lastName,firstName,email,expDate,items);

        return purchaseOrderService.createNewPurchaseOrder(tempPurchaseOrder);
    }




}
