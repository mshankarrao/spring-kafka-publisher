package com.ford.kafka.config;


import com.ford.kafka.stream.PublishStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(PublishStream.class)
public class AppConfig {
}
