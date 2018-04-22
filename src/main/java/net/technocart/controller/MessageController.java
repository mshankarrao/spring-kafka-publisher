package net.technocart.controller;

import com.technocart.domain.Message;
import com.technocart.service.PublishServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
    private final PublishServiceImpl publishService;

    public MessageController(PublishServiceImpl publishService) {
        this.publishService = publishService;
    }

    @RequestMapping("/message")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void greetings(@RequestParam("message") String message) {
        Message message1 = new Message();
        message1.setMessage(message);
        message1.setTimestamp(System.currentTimeMillis());
        publishService.sendGreeting(message1);
    }
}