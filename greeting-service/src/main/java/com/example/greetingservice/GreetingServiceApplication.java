package com.example.greetingservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GreetingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreetingServiceApplication.class, args);
    }
}


@Slf4j
@RestController
@RequestMapping("/api/v1")
class GreetingController {

    @GetMapping("/greeting/{name}")
    String greeting(@PathVariable String name) {
        log.info("Say hello to {}", name);
        return "Hello, " + name;
    }
}
