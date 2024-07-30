package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public Message getMessage() {
        return new Message("Hello from Spring Boot!");
    }
}
