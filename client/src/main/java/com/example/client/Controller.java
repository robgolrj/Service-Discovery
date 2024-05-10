package com.example.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @GetMapping("/get")
    public String get(){
        System.out.println("passou");
        return "Alo mundo";
    }
}
