package com.example.kafka.controller;

import com.example.kafka.kafka.JsonKafkaProducer;
import com.example.kafka.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

  private final JsonKafkaProducer kafkaProducer;

  @Autowired
  public JsonMessageController(JsonKafkaProducer kafkaProducer) {
    this.kafkaProducer = kafkaProducer;
  }

  @PostMapping("/publish")
  public ResponseEntity<String> publish(@RequestBody User user) {
    kafkaProducer.sendMessage(user);
    return ResponseEntity.ok("Json message sent to kafka topic");
  }

}