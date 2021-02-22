package com.tts.reviewspring.controller;

import com.tts.reviewspring.model.Greeting;
import com.tts.reviewspring.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    GreetingService greetingService;

    public HelloController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public Greeting getHello(){
        return greetingService.getGreeting();
    }

}
