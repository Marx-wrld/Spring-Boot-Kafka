package com.marxcode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "marxcode", groupId = "elf")
    void listener(String data){
        System.out.println("Listener received: " + data + "😁🎉");
    }

}
