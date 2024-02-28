package ru.titov.kafkaconsumer.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import ru.titov.kafkaconsumer.domain.IncomingMessage;

@Service
public class AppListener {

    @KafkaListener(topics = "test-topic23", groupId = "foo")
    public void listenGroupFoo(IncomingMessage incomingMessage) {
        System.out.println("get message from Kafka : " + incomingMessage.toString());

    }

    @JmsListener(destination = "test-topic24")
    public void receive(String message) {
        System.out.println(String.format("Get message from Artemis: %s", message));
    }
}
