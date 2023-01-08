package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author lkadai0801
 * @since 08/01/2023
 */
@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic topic(){
        return TopicBuilder.name("kafka.example")
                .partitions(10)
                .replicas(3)
                .build();
    }
}
