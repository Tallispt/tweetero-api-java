package com.tweetero.api.models;

import com.tweetero.api.dtos.TweetDTO;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
public class Tweet extends User {
  private String tweet;

  public Tweet(TweetDTO dto){
    super(dto.username());
    this.tweet = dto.tweet();
  }

  public void setAvatar(String avatar){
    super.setAvatar(avatar);
  }
}
