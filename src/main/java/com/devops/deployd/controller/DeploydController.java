package com.devops.deployd.controller;

import com.devops.deployd.model.User;
import com.devops.deployd.service.DeploydService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeploydController {

    @Autowired
    DeploydService service;

    @GetMapping("/com/devops/deployd/users")
    public ResponseEntity<String> getUsers() {
        return new ResponseEntity<>("First Deployd Response", HttpStatus.OK);
    }

    @PostMapping("/com/devops/deployd/users")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity(service.createUsers(user), HttpStatus.CREATED);
    }
}