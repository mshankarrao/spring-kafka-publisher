package com.technocart.kafkaspringcloud.config;


import com.technocart.kafkaspringcloud.stream.PublishStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(PublishStream.class)
public class AppConfig {
}
