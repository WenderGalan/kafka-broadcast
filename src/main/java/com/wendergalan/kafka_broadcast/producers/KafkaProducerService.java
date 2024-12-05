package com.wendergalan.kafka_broadcast.producers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.topic.name}")
    private String topicName;

    public void sendMessage(String message) {
        kafkaTemplate.send(topicName, message);
    }
}
