package com.arshh2211.springSecEx;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String greet(HttpServletRequest request){
        return "Hii Welcome Adarsh Lucky world...)"+request.getSession().getId();
    }
}
