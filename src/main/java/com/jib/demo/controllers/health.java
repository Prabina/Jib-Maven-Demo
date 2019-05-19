package com.jib.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class health {

    @RequestMapping("/")
    public String health(){
        return "Hello World!!";
    }
}
