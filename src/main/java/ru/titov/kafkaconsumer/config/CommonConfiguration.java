package ru.titov.kafkaconsumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({KafkaConsumerConfig.class, ArtemisConsumerConfig.class})
@Configuration
public class CommonConfiguration {
}
