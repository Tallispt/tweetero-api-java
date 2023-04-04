package com.tweetero.api.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tweetero.api.models.Tweet;
import com.tweetero.api.models.User;

@Repository
public class TweetRepository {
  private List<Tweet> tweets = new ArrayList<>();

  public List<Tweet> findAll() {
    return tweets;
  }

  public List<Tweet> findByPagination(int page) {
    int fromIndex = (page - 1) * 5;
    if(tweets == null || tweets.size() <= fromIndex){
        return Collections.emptyList();
    }

    return tweets.subList(fromIndex, Math.min(fromIndex + 5, tweets.size()));
  }

  // public Tweet findByUsername(String username) {
  //   tweets.
  // }

  public Tweet save(Tweet tweet, List<User> users){
    User tweetUser = findUsernameByTweet(tweet, users);
    tweet.setAvatar(tweetUser.getAvatar());
    tweets.add(tweet);
    return tweet;
  }

  public User findUsernameByTweet(
    Tweet tweet, List<User> users) {

    for(User user : users) {
      if(user.getUsername().equals(tweet.getUsername()));
      return user;
    }
    return new User();
}
}
