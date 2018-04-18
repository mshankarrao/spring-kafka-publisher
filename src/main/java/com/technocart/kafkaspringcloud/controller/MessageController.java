package com.technocart.kafkaspringcloud.controller;

import com.technocart.kafkaspringcloud.domain.Message;
import com.technocart.kafkaspringcloud.service.PublishService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
    private final PublishService publishService;

    public MessageController(PublishService publishService) {
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