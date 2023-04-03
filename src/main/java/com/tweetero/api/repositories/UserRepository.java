package com.tweetero.api.repositories;

import java.util.ArrayList;
import java.util.List;

import com.tweetero.api.models.User;

public class UserRepository {
  private List<User> users = new ArrayList<User>();
  
  public List<User> findAll() {
    return users;
  }

  public User save(User user) {
    users.add(user);
    return user;
  }
}
