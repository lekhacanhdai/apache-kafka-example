package com.example.kafka.service;

import com.example.kafka.message.ChatMessage;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * @author lkadai0801
 * @since 08/01/2023
 */

@Service
@KafkaListener(topics = {
        "kafka.example",
}, containerFactory = "kafkaListenerContainerFactory")
@Log4j2
public class KafkaConsumerService {
    @KafkaHandler
    public void receiveMessage(@Payload ChatMessage chatMessage){
        log.info("_________________________RECEIVE_________________________");
        log.info("userId: {}", chatMessage.getUserId());
        log.info("username: {}", chatMessage.getUsername());
        log.info("message: {}", chatMessage.getMessage());
        log.info("_________________________END______________________________");

    }
}
