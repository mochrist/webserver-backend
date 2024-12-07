package de.moch.webservertest.boundary;

import de.moch.webservertest.models.CustomMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/api")
    public ResponseEntity<List<CustomMessage>> sayHello() {
        CustomMessage response = new CustomMessage("Hello", "This is the default backend message");
        List<CustomMessage> messageList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            messageList.add(response);
        }
        return ResponseEntity.ok(messageList);
    }

    @PostMapping("/api")
    public ResponseEntity<CustomMessage> greetUser(@RequestBody CustomMessage message) {
        CustomMessage response = new CustomMessage(message.getTitle(), message.getContent());
        return ResponseEntity.ok(response);
    }
}
