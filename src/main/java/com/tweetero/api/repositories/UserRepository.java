package com.tweetero.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tweetero.api.models.User;

@Repository
public class UserRepository {
  private List<User> users = new ArrayList<User>();

  public User save(User user) {
    users.add(user);
    return user;
  }
}
