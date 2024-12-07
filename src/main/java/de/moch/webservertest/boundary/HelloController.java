package de.moch.webservertest.boundary;

import de.moch.webservertest.models.CustomMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api")
    public ResponseEntity<CustomMessage> sayHello() {
        CustomMessage response = new CustomMessage("Hello", "This is the default backend message");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/api")
    public ResponseEntity<CustomMessage> greetUser(@RequestBody CustomMessage message) {
        CustomMessage response = new CustomMessage(message.getTitle(), message.getContent());
        return ResponseEntity.ok(response);
    }
}
