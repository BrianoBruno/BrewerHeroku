package com.example.demoforheroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TestController {

    @GetMapping("/coffee")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public String getHealth(){
        return "I am a teapot, deployed on heroku!";
    }

}
