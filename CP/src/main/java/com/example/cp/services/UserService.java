package com.example.cp.services;

import com.example.cp.models.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;


@Service
public class UserService {
    public UserService() {
    }

    public String postNewUser(User user) throws ExecutionException, InterruptedException {
        Firestore db = FirestoreClient.getFirestore();
        CollectionReference productPostRef =  db.collection("User");
        ApiFuture<DocumentReference> future = productPostRef.add(user);
        setUserObjectId(future.get().getId());
        return  future.get().getId();
    }

    private void setUserObjectId(String id)  {
        // Update id of recently added document to collection because it can't be updated at time its being stored
        // updating at time it stored causes it to great a different id then one for the collection
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> future =  db.collection("User").document(id).update("id",id);
    }

}
