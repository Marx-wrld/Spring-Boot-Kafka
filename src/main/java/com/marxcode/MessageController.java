package com.marxcode;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/messages")
public class MessageController {

    private final KafkaTemplate<String, String> KafkaTemplate;

    public MessageController(KafkaTemplate<String, String> KafkaTemplate) {
        this.KafkaTemplate = KafkaTemplate;
    }
    @PostMapping
    public void publish(@RequestBody MessageRequest request) {
        KafkaTemplate.send("marxcode", request.message());
    }

}
