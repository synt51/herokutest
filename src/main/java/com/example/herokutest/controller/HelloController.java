package com.example.herokutest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public String sayHello(){
        return "Moin moin, was geht? Alles klar bei dir? Wie spät? Gleich neun, okay tetst";
    }
}
