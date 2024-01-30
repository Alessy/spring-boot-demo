package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {


  @GetMapping("/helloworld")
  public String helloWorld() {
    return "Hello world";

  }
  
}
