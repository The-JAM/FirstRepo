package com.example.cp.services;

import com.example.cp.models.RestPurchaseOrder;
import com.example.cp.models.PurchaseOrder;
import com.google.api.core.ApiFuture;
import com.google.cloud.Timestamp;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;
import com.example.cp.models.User;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;

import java.util.*;
import java.util.concurrent.ExecutionException;

@Service
public class PurchaseOrderService {
    public PurchaseOrderService() {
    }


    public String createNewPurchaseOrder(PurchaseOrder purchaseOrder) throws ExecutionException, InterruptedException{
        //database connection object
        Firestore db = FirestoreClient.getFirestore();
        CollectionReference collectionReference = db.collection("PurchaseOrder");
        ApiFuture<DocumentReference> future = collectionReference.add(purchaseOrder);
        return ((DocumentReference)future.get()).getId();
    }


}
