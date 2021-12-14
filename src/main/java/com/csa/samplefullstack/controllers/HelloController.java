package com.csa.samplefullstack.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")   // allows different (all if "*" is used) requests
public class HelloController {
    
    @RequestMapping("/hello")
    public String hello(){
        return "bonjour, escargot";
    }
}
