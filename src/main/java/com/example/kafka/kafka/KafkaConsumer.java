package com.example.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

  /**
   * Слушатель сообщений, как только мы написали сообщение, оно отображается в логе
   */
  @KafkaListener(topics = "javaGuidesTopic", groupId = "myGroup")
  public void consume(String message) {
    LOGGER.info("Message received -> {}", message);
  }

}