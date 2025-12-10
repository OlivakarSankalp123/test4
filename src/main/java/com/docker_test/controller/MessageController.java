package com.docker_test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @RequestMapping("/message")
    public String getMessage(){
        return "Message";
    }
}
