package com.example.productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//r=controller support rest API's (HTTP request)
@RestController
@RequestMapping("/hello")
public class SampleAPIController {
    @GetMapping("/{name}/{number}")
    public String hello(@PathVariable("name") String name,@PathVariable("number") int num) {
        StringBuilder str = new StringBuilder();
        for(int i=1;i<=num;i++) {
            str.append("Hello ").append(name);
        }
        return str.toString();
    }
}
