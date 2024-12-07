package de.moch.webservertest.boundary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api")
    public String sayHello() {
        return "Hello World from the new Backend";
    }

    @PostMapping("/api")
    public String greetUser(String name) {
        return "Hi " + name + ", how are you?";
    }
}
