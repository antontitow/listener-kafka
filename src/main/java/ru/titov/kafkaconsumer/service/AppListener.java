package ru.titov.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.titov.kafkaconsumer.domain.IncomingMessage;

@Service
public class AppListener {

    @KafkaListener(topics = "test-topic18", groupId = "foo")
    public void listenGroupFoo(IncomingMessage incomingMessage) {
        System.out.println("incoming Message in group foo: " + incomingMessage.toString());

    }
}
