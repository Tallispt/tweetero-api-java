# Tweteroo API in Java

This REST API project, inspired by the backend of Twitter, has been implemented using *Spring Boot framework in Java*. The project follows the same functionality as the previous implementation, providing basic functionality for creating a user account, posting a tweet, and retrieving tweets from a user's timeline.

## Other versions:
- ### [Tweetero API](https://github.com/Tallispt/tweteroo/tree/main)

A simple version of tweteroo rest-api in JavaScript.

- ### [Tweteroo API OOP-JS](https://github.com/Tallispt/tweteroo/tree/oop-js)

A version using layered architecture and *objects oriented programming*

- ### [Tweteroo API OOP-TS](https://github.com/Tallispt/tweteroo/tree/oop-ts)

A version using layered architecture and objects oriented programming in *TypeScript*.

## Technologies Used

- [Spring-Boot](https://spring.io/)
- [Maven](https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/)

## Usage

Fork or clone repository

...

The api will be available at http://localhost:5000.

## Routers

- ### /sign-up

#### POST

```json
# Request body
{
  "username": "String",
  "avatar": "Image-URL"
}
```

- ### /tweets

#### POST

```json
# Request body
{
  "username": "String",
  "tweet": "String"
}
```

#### GET

```json
# Response body
[
  {
    "username": "String",
    "tweet": "String",
    "avatar": "Image-URL"
  }
]
```

*Request Params*

- **/{username}**  
  - GET tweets by *username*  

*Query string*  
- **?page=***{number}*
  - GET tweets with *pagination*  
