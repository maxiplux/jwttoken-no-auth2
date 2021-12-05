package com.example.jwttokennoauth2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivByZeroException extends RuntimeException {
    public DivByZeroException(String message) {
        super(message);
    }
}
