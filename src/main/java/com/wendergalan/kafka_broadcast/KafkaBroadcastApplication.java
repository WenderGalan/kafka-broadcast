package com.wendergalan.kafka_broadcast;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(title = "Kafka Broadcast"))
@SpringBootApplication
public class KafkaBroadcastApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaBroadcastApplication.class, args);
    }
}
