package com.anhad.Formz;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoints {

  //private static final String template = "Hello, %s!";
  //private final AtomicLong counter = new AtomicLong();
  
  @GetMapping("/")
  public String index() {
    return "Hello";
  }

  @PostMapping("/")
  public String sayHello(@RequestParam("name") String name, 
                         @RequestParam("email") String email,
                         @RequestParam("userid") String userid) {
    String str = new String("Hello " + name + "! Thank you for registering.");
    return str;
  }

}