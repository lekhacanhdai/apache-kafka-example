package com.example.kafka.message;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author lkadai0801
 * @since 08/01/2023
 */


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ChatMessage /* implements Serializable */{
    private Long userId;
    private String username;
    private String message;
}
