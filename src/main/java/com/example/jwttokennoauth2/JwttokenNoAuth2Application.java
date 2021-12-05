package com.example.jwttokennoauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwttokenNoAuth2Application {
    // kata from : https://medium.com/@akhileshanand/spring-boot-api-security-with-jwt-and-role-based-authorization-fea1fd7c9e32
    public static void main(String[] args) {
        SpringApplication.run(JwttokenNoAuth2Application.class, args);
    }

}
