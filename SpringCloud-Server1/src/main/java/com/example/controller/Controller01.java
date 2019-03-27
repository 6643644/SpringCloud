package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller01 {
	
	@RequestMapping(value = "/demo")
    public void sayHello() {
        System.out.println("Demo");
    }
}
