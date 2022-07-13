package com.example.arjundemo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/testing")
    public String start(){
        return "Hello Arjun";
    }

}
