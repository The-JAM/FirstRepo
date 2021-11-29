package com.example.cp.controllers;

import com.example.cp.models.User;
import com.example.cp.services.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;


@RestController()
public class UserRestController {

    public UserService userService;

    @Autowired
    public UserRestController(UserService userService) {this.userService = userService;}

    @GetMapping("/")
    public String getUser(){

        return "";
    }

    @PostMapping("/user")
    public String postNewUser(@RequestBody String json) throws JsonProcessingException, ExecutionException, InterruptedException {


        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(json);
        String id = "";
        String firstName = rootNode.get("firstName").asText();
        String lastName = rootNode.get("lastName").asText();
        String email = rootNode.get("email").asText();
        String password = rootNode.get("password").asText();
        User tempUser = new User(id,firstName,lastName,email,password);
        return userService.postNewUser(tempUser);
    }
}
