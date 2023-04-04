package com.tweetero.api.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.tweetero.api.models.Tweet;

@Repository
public class TweetRepository {
  private List<Tweet> tweets = new ArrayList<>();

  public List<Tweet> findAll() {
    return tweets;
  }
  
  public List<Tweet> findByUsername(String username) {
    return tweets.stream()
      .filter(tweet -> username.equals(tweet.getUsername()))
      .collect(Collectors.toList());
  }

  public Tweet save(Tweet tweet){
    tweets.add(tweet);
    return tweet;
  }
}
