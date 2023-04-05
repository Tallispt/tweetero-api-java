package com.tweetero.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.UserDTO;
import com.tweetero.api.models.User;
import com.tweetero.api.services.UserService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/sign-up")
public class UserController {
  
  @Autowired
  private UserService service;

  @PostMapping
  public ResponseEntity<String> insertUser(@RequestBody @Valid UserDTO req) {
    User user = service.save(req);
    if(user.emptyFinder()) {
      return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists!");
    }
    return ResponseEntity.status(HttpStatus.CREATED).body("OK");
  }
  
}
