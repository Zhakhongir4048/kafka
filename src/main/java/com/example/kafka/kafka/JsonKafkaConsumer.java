package com.example.kafka.kafka;

import com.example.kafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

  /**
   * Слушатель сообщений, как только мы написали сообщение, оно отображается в логе
   */
  @KafkaListener(topics = "javaGuidesTopicJson", groupId = "myGroup")
  public void consume(User user) {
    LOGGER.info("Json message received -> {}", user);
  }

}