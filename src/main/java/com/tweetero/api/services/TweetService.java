package com.tweetero.api.services;

import java.util.Collections;
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
    List<Tweet> tweets = repository.findAll();

    if(page > 0) {
      return paginateList(tweets, page);
    }
    return tweets;
  }

  public List<Tweet> findByUsername(String username, int page) {
    List<Tweet> filteredTweets = repository.findByUsername(username);

    if(page > 0) {
      return paginateList(filteredTweets, page);
    }
    return filteredTweets;
  }

  public Tweet save(TweetDTO dto){
    User user = userRepository.findByUsername(dto.username());
    if(user.equals(new User())){
      return new Tweet();
    }
    return repository.save(new Tweet(dto, user.getAvatar()));
  }

  public List<Tweet> paginateList(List<Tweet> list,int page) {
    int fromIndex = (page - 1) * 5;
    if(list == null || list.size() <= fromIndex){
        return Collections.emptyList();
    }

    return list.subList(fromIndex, Math.min(fromIndex + 5, list.size()));
  }
}
