package com.tweetero.api.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tweetero.api.models.User;

@Repository
public class UserRepository {
  private List<User> users = new ArrayList<User>();

  public List<User> findAll(){
    return this.users;
  }  

  public User findByUsername(String username){
    for(User user : users) {
      if(user.getUsername().equals(username)){
        return user;
      }
    }
    return new User();
  }

  public User save(User user) {
    this.users.add(user);
    return user;
  }
}
