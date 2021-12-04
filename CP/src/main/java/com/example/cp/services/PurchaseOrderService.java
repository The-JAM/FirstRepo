package com.example.cp.services;

import com.example.cp.models.RestPurchaseOrder;
import com.example.cp.models.PurchaseOrder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;
import com.example.cp.models.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;
import java.util.*;
import java.util.concurrent.ExecutionException;


import java.util.ArrayList;

@Service
public class PurchaseOrderService {
    public PurchaseOrderService() {
    }

    private List<PurchaseOrder> getPurchaseOrders(Firestore db, List<PurchaseOrder> purchaseOrders, DocumentReference createdByRef, Query query) throws InterruptedException, ExecutionException {
        List<QueryDocumentSnapshot> docs = ((QuerySnapshot)query.get().get()).getDocuments();
        Iterator var6 = docs.iterator();

        while(var6.hasNext()) {
            QueryDocumentSnapshot document = (QueryDocumentSnapshot)var6.next();
            Number CVV = document.getDouble("CVV");
            Number cardNumber = document.getDouble("cardNumber");
            String createdByUserDocPath = createdByRef.getPath();
            User createByDocument = (User)((DocumentSnapshot)db.document(createdByUserDocPath).get().get()).toObject(User.class);
            Timestamp expirationDate = document.getTimestamp("expirationDate");
            String firstName = document.getString("firstName");
            String lastName = document.getString("lastName");

            purchaseOrders.add(new PurchaseOrder(CVV, cardNumber, lastName, firstName, expirationDate.toSqlTimestamp().toLocalDateTime(), createByDocument));
        }

        return purchaseOrders;
    }

    public String createNewPurchaseOrder(RestPurchaseOrder restPurchaseOrder) throws ExecutionException, InterruptedException{
        //database connection object
        Firestore db = FirestoreClient.getFirestore();
        CollectionReference collectionReference = db.collection("PurchaseOrder");
        ApiFuture<DocumentReference> future = collectionReference.add(restPurchaseOrder);
        return ((DocumentReference)future.get()).getId();
    }


}
