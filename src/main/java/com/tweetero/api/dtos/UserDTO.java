package com.tweetero.api.dtos;

import org.hibernate.validator.constraints.URL;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDTO(

  @NotBlank
  @NotNull
  String username, 
  
  @NotBlank
  @NotNull
  @URL
  String avatar) {
}
