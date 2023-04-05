package com.tweetero.api.models;

import com.tweetero.api.dtos.UserDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
  private String username;
  private String avatar;

  public User(UserDTO dto) {
    this.username = dto.username() ;
    this.avatar = dto.avatar();
  }

  public User(String username, String avatar) {
    this.username = username;
    this.avatar = avatar;
  }

  public boolean isEmpty() {
    return (this.username == null || this.avatar == null);
  }
}
