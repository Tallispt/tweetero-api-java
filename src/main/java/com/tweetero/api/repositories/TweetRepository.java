package com.tweetero.api.repositories;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

  public List<Tweet> findByUsername(String username) {
    return tweets.stream()
      .filter(tweet -> username.equals(tweet.getUsername()))
      .collect(Collectors.toList());
  }

  public List<Tweet> findByUsernameByPagination(String username, int page) {
    List<Tweet> filteredTweets = tweets.stream()
      .filter(tweet -> username.equals(tweet.getUsername()))
      .collect(Collectors.toList());

      int fromIndex = (page - 1) * 5;
      if(filteredTweets == null || filteredTweets.size() <= fromIndex){
          return Collections.emptyList();
      }
  
      return filteredTweets.subList(fromIndex, Math.min(fromIndex + 5, filteredTweets.size()));
  }

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
