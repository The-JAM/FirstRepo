package com.example.cp.services;

import com.example.cp.models.User;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.*;
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

    public User getUser(String username, String userPassword) throws ExecutionException, InterruptedException {
        Firestore db  = FirestoreClient.getFirestore();
        Query querySnapshot = db.collection("User").whereEqualTo("email", username.toLowerCase())
                .whereEqualTo("password", userPassword);


        QueryDocumentSnapshot result = querySnapshot.get().get().getDocuments().get(0);

        String Id = result.getId();
        String firstName = result.getString("firstName");
        String lastName = result.getString("lastName");
        String email = result.getString("email");
        String password =  result.getString("password");

        return new User(Id,firstName,lastName,email,password);

    }

}
