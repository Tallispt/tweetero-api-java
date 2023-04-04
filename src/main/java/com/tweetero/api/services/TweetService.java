package com.tweetero.api.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.api.dtos.TweetDTO;
import com.tweetero.api.models.Tweet;
import com.tweetero.api.models.User;
import com.tweetero.api.repositories.TweetRepository;

@Service
public class TweetService {
  
  @Autowired
  private TweetRepository repository;

  public List<Tweet> find(int page) {
    if(page == 0) {
      return repository.findAll();
    }
    return repository.findByPagination(page);
  }

  // public Tweet findByUsername(String username) {
  //   return repository.findByUsername(username);
  // }

  public Tweet save(TweetDTO dto){
    // List<User> users = repository.findAll();
    List<User> users = new ArrayList<>();
    return repository.save(new Tweet(dto), users);
  }
}
