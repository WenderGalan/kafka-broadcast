package com.wendergalan.kafka_broadcast.controllers;

import com.wendergalan.kafka_broadcast.producers.KafkaProducerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Kafka Producer")
@RestController
@RequestMapping("/produce")
@RequiredArgsConstructor
public class KafkaProducerController {
    private final KafkaProducerService producerService;

    @PostMapping("/{message}")
    public String produce(@PathVariable String message) {
        producerService.sendMessage(message);
        return "Message sent: " + message;
    }
}

