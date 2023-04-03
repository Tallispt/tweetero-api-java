package com.tweetero.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.UserDTO;
import com.tweetero.api.models.User;
import com.tweetero.api.services.UserService;


@RestController
@RequestMapping("/sign-up")
public class authController {
  
  @Autowired
  private UserService service;

  @PostMapping
  public User insertUser(@RequestBody UserDTO req) {
    return service.save(req);
  }
  
}
