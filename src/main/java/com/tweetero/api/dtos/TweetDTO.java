package com.tweetero.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TweetDTO(
  @NotBlank
  @NotNull
  String username,

  @NotBlank
  @NotNull
  String tweet
) {
  
}
