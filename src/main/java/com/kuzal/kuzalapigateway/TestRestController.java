package com.kuzal.kuzalapigateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/test")
    public String testMethod() {
        return "jenkins success!!";
    }
}
