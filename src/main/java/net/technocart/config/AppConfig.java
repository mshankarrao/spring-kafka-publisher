package net.technocart.config;


import com.technocart.stream.PublishStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(PublishStream.class)
public class AppConfig {
}
