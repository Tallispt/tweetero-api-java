package com.tweetero.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  public List<Tweet> getTweets(@RequestParam(name = "page", defaultValue = "0") int page) {
    return service.find(page);
  }

  @GetMapping("/{username}")
  public List<Tweet> getTweetsByUsername(@PathVariable String username, @RequestParam(name = "page", defaultValue = "0") int page) {
    return service.findByUsername(username, page);
  }
  
  @PostMapping
  public ResponseEntity<String> insertTweet(@RequestBody @Valid TweetDTO req) {
    Tweet tweet = service.save(req);
    if(tweet.isEmpty()){
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User does not exist!");
    }
    return ResponseEntity.status(HttpStatus.CREATED).body("OK");
  }
}
