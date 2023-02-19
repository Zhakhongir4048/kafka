package com.example.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

  /**
   * Создание кафка топика
   */
  @Bean
  public NewTopic javaGuidesTopic() {
    return TopicBuilder.name("javaGuidesTopic")
        .partitions(10)
        .build();
  }

  @Bean
  public NewTopic javaGuidesTopicJson() {
    return TopicBuilder.name("javaGuidesTopicJson")
        .partitions(10)
        .build();
  }

}