package com.akatsukilab.orders.controller;

import com.akatsukilab.orders.models.User;
import com.akatsukilab.orders.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    public ResponseEntity<?> getUsers() {


        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }

    @GetMapping("users/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") String id) {


        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }

    @PostMapping("users")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        userService.saveUser(user);

        return new ResponseEntity<>("user saved", HttpStatus.OK);
    }
    
    @PutMapping("users/{id}")
    public ResponseEntity<?> editUser(@PathVariable("id") String id) {


        return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
    }



}
