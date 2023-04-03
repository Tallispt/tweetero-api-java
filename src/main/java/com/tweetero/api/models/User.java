package com.tweetero.api.models;

import com.tweetero.api.dtos.UserDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
  private String username;
  private String avatar;

  public User(UserDTO req) {
    this.username = req.username() ;
    this.avatar = req.avatar();
  }
}
