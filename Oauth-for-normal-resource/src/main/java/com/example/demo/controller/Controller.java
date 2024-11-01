package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Controller {
    @GetMapping("/public")
    public String publicEndpoint() {
        return "This is a public endpoint.";
    }

    // Private endpoint
    @GetMapping("/private")
    public String privateEndpoint() {
        return "This is a private endpoint. Authorization required.";
    }
}