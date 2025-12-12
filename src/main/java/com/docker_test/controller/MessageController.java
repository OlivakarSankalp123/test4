package com.docker_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String getMessage(){
        return "Message";
    }

    @GetMapping("/sankalp")
    public String getSankalp(){
        return "Hii Sankalp";
    }
}
