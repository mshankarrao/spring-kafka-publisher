package com.ford.kafka.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface PublishStream {
    String OUTPUT = "greetings-out";

    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}
