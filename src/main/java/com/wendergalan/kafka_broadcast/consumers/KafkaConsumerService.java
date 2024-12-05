package com.wendergalan.kafka_broadcast.consumers;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.group.id1}")
    public void consume1(ConsumerRecord<String, String> record) {
        log.info("Message consumed by group 1: {}", record.value());
    }

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.group.id2}")
    public void consume2(ConsumerRecord<String, String> record) {
        log.info("Message consumed by group 2: {}", record.value());
    }

    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.group.id3}")
    public void consume3(ConsumerRecord<String, String> record) throws Exception {
        if (Math.random() < 0.5) {
            log.info("Caiu na exceção");
            throw new Exception("Erro aleatório ao consumir mensagem pelo grupo 3");
        }
        log.info("Message consumed by group 3: {}", record.value());
    }

//    @KafkaListener(topics = "${kafka.topic.name}", groupId = "${kafka.group.id3}")
//    public void consumeMT3(ConsumerRecord<String, String> record) {
//        System.out.println("Message consumed by group 33: " + record.value());
//    }
}
