package com.ecommerce.store;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
     @GetMapping("/hello")
    public String getHello(){
        return "The name of Jesus is the greatest name ever!!!";
    }
}
