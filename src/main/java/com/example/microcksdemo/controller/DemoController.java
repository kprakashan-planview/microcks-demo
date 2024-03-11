package com.example.microcksdemo.controller;

import com.example.microcksdemo.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @PostMapping("/createUser")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        User newUser = new User();
        newUser.setAge(25);
        newUser.setId(new Random().nextLong());
        newUser.setName(user.getName());
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<?> getUser(@PathVariable Long userId) {
        User newUser = new User();
        newUser.setAge(25);
        newUser.setId(userId);
        newUser.setName("Jane Doe");
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

}
