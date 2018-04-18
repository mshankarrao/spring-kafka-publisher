package com.technocart.kafkaspringcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface PublishStream {
    String OUTPUT = "greetings-out";

    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}
