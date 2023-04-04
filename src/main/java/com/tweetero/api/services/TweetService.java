package com.tweetero.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetero.api.dtos.TweetDTO;
import com.tweetero.api.models.Tweet;
import com.tweetero.api.models.User;
import com.tweetero.api.repositories.TweetRepository;
import com.tweetero.api.repositories.UserRepository;

@Service
public class TweetService {
  
  @Autowired
  private TweetRepository repository;

  @Autowired
  private UserRepository userRepository;

  public List<Tweet> find(int page) {
    if(page == 0) {
      return repository.findAll();
    }
    return repository.findByPagination(page);
  }

  public List<Tweet> findByUsername(String username, int page) {
    if(page == 0) {
      return repository.findByUsername(username);
    }
      return repository.findByUsernameByPagination(username, page);
  }

  public Tweet save(TweetDTO dto){
    List<User> users = userRepository.findAll();
    // return 
    return repository.save(new Tweet(dto), users);
  }
}
