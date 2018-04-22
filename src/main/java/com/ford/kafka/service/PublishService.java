package com.ford.kafka.service;


import com.ford.kafka.domain.Message;
import com.ford.kafka.stream.PublishStream;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class PublishService {
    private final PublishStream messagePublishStream;

    public PublishService(PublishStream messagePublishStream) {
        this.messagePublishStream = messagePublishStream;
    }

    public void sendGreeting(final Message greetings) {
        MessageChannel messageChannel = messagePublishStream.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}
