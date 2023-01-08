package com.example.kafka.controller;

import com.example.kafka.message.ChatMessage;
import com.example.kafka.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author lkadai0801
 * @since 08/01/2023
 */

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final KafkaProducerService producerService;

    @PostMapping("/message")
    public ResponseEntity<?> sendMessage(@RequestBody ChatMessage message){
        producerService.sendMessage(message);
        Map<String, Boolean> response = Map.of("success", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
