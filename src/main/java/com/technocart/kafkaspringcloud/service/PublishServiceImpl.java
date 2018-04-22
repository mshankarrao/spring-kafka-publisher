package com.technocart.kafkaspringcloud.service;


import com.technocart.kafkaspringcloud.domain.Message;
import com.technocart.kafkaspringcloud.stream.PublishStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
@Slf4j
public class PublishServiceImpl implements PublishService {
    private final PublishStream messagePublishStream;

    public PublishServiceImpl(PublishStream messagePublishStream) {
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
