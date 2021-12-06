package com.example.cp.controllers;

import com.example.cp.models.User;
import com.example.cp.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;


@RestController()
public class UserRestController {

    public UserService userService;

    @Autowired
    public UserRestController(UserService userService) {this.userService = userService;}


    @PostMapping("/user")
    public String postNewUser(@RequestBody String json) throws JsonProcessingException, ExecutionException, InterruptedException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);
        String id = "";
        String firstName = rootNode.get("firstName").asText().toLowerCase();
        String lastName = rootNode.get("lastName").asText().toLowerCase();
        String email = rootNode.get("email").asText().toLowerCase();
        String password = rootNode.get("password").asText();
        User tempUser = new User(id,firstName,lastName,email,password);
        return userService.postNewUser(tempUser);
    }

    @PostMapping("/login")
    public User getUser(@RequestBody String json ) throws ExecutionException, InterruptedException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);
        String email = rootNode.get("username").asText();
        String password = rootNode.get("password").asText();
        return userService.getUser(email,password);
    }
}
