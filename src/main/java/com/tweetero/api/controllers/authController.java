package com.tweetero.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.models.User;
import com.tweetero.api.repositories.UserRepository;


@RestController
@RequestMapping("/sign-up")
public class authController {

  UserRepository repository = new UserRepository();

  @GetMapping
  public List<User> getUsers() {
    return repository.findAll();
  }

  @PostMapping
  public User insertUser(@RequestBody User user) {
    return repository.save(user);
  }
  
}
