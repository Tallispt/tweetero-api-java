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

  public Tweet(TweetDTO dto, String avatar){
    super(dto.username(), avatar);
    this.tweet = dto.tweet();
  }
}
