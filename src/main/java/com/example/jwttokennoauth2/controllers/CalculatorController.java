package com.example.jwttokennoauth2.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @PreAuthorize("hasRole('ADMIN_ROLE')")
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public Double add(Double a,Double b){
        return a+b;
    }

    @PreAuthorize("hasRole('ADMIN_ROLE')")
    @RequestMapping(value="/subtract", method = RequestMethod.POST)
    public Double subtract(Double a,Double b){
        return a-b;
    }

    @PreAuthorize("hasRole('ADMIN_ROLE')")
    @RequestMapping(value="/multiply", method = RequestMethod.POST)
    public Double multiply(Double a,Double b){
        return a*b;
    }

    @PreAuthorize("hasRole('ADMIN_ROLE')")
    @RequestMapping(value="/div", method = RequestMethod.POST)
    public Double div(Double a,Double b) {
        if (b == 0)
        {
            throw new DivByZeroException("No Dog Found Here..");
        }
        return a/b;
    }

}
