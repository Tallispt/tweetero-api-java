# Tweteroo API in Java

Description

## Other versions:
- ### [Tweetero API](https://github.com/Tallispt/tweteroo/tree/main)

A simple version of tweteroo rest-api in JavaScript.

- ### [Tweteroo API OOP-JS](https://github.com/Tallispt/tweteroo/tree/oop-js)

Descrition

- ### [Tweteroo API OOP-TS](https://github.com/Tallispt/tweteroo/tree/oop-ts)

Description

## Technologies Used

- [Spring-Boot](https://spring.io/)

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
