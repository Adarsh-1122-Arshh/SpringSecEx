package com.arshh2211.springSecEx;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(){
        return "Hii Welcome Adarsh Lucky world...:)";
    }
}
