package com.javadev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinContrller {
     @GetMapping (value="/getMessage")
    public String method(){
        return  "this is my jenkin package";
    }
}
