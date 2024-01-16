package config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean //Adding a bean so that this code gets instantiated and we get a new topic
    public NewTopic marxcodeTopic(){
        return TopicBuilder.name("marxcode")
                .build();
    }
}
