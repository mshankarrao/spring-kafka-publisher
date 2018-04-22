package com.technocart.kafkaspringcloud.service;

import com.technocart.kafkaspringcloud.domain.Message;

public interface PublishService {

     void sendGreeting(final Message greetings);
}
