package com.tweetero.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.UserDTO;
import com.tweetero.api.models.User;
import com.tweetero.api.repositories.UserRepository;


@RestController
@RequestMapping("/sign-up")
public class authController {
  UserRepository repositoriy = new UserRepository();

  @PostMapping
  public User insertUser(@RequestBody UserDTO req) {
    return repositoriy.save(new User(req));
  }
  
}
