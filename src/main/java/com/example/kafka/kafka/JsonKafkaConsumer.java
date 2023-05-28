package com.example.kafka.kafka;

import com.example.kafka.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    /**
     * Слушатель сообщений, как только мы написали сообщение, оно отображается в логе
     */
    @KafkaListener(topics = "javaGuidesJson", groupId = "myGroup")
    public void consume(User user) {
        log.info("Json message received -> {}", user);
    }

}