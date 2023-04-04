package com.tweetero.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.dtos.TweetDTO;
import com.tweetero.api.models.Tweet;
import com.tweetero.api.services.TweetService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/tweets")
public class TweetController {
  
  @Autowired
  private TweetService service;

  @GetMapping
  public List<Tweet> getTweets() {
      return service.find();
  }

  // @GetMapping("/{username}")
  // public List<Tweet> getTweetsByUsername(@RequestParam String username) {
  //     return service.findByUsername(username);
  // }
  
  @PostMapping
  public Tweet insertTweet(@RequestBody @Valid TweetDTO req) {
    return service.save(req);
  }
}
