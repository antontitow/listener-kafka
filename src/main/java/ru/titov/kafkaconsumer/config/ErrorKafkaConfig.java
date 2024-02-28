package ru.titov.kafkaconsumer.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.util.backoff.BackOff;
import org.springframework.util.backoff.FixedBackOff;

@Configuration
@ConfigurationProperties(prefix = "kafka.backoff")
@Getter
@Setter
public class ErrorKafkaConfig {
    private Long interval = 0L;
    private Long maxAttempts = 0L;

    @Bean
    public DefaultErrorHandler errorHandler() {
        BackOff fixedBackOff = new FixedBackOff(interval, maxAttempts);
        DefaultErrorHandler errorHandler = new DefaultErrorHandler((consumerRecord, exception) -> {
            System.out.println("handle error message");
            // logic to execute when all the retry attemps are exhausted
        }, fixedBackOff);

        return errorHandler;
    }
}
