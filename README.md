# Tweteroo API in Java

This REST API project, inspired by the backend of Twitter, has been implemented using *Spring Boot framework in Java*. The project follows the same functionality as the previous implementation, providing basic functionality for creating a user account, posting a tweet, and retrieving tweets from a user's timeline.

Here you can find the respective repository for the front end application [Tweteroo](https://github.com/Tallispt/tweteroo-front).

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

* Clone this repository 
* Make sure you are using JDK 1.8 and Maven 3.x
* You can build the project and run the tests by running ```mvn clean package```
* Once successfully built, you can run the service by one of these two methods:
```
        java -jar -Dspring.profiles.active=test target/spring-boot-rest-example-0.5.0.war
or
        mvn spring-boot:run -Drun.arguments="spring.profiles.active=test"
```
* Check the stdout or boot_example.log file to make sure no exceptions are thrown

Once the application runs you should see something like this

```
2017-08-29 17:31:23.091  INFO 19387 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8090 (http)
2017-08-29 17:31:23.097  INFO 19387 --- [           main] com.khoubyari.example.Application        : Started Application in 22.285 seconds (JVM running for 23.032)
```

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
