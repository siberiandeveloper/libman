package tld.library.cool.app.jms.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class BookConsumer {

    @KafkaListener(topics = "books", groupId = "books", containerFactory = "concurrentKafkaListenerContainerFactory")
    public void consume(String test) {
        System.out.println("Consumed message: " + test);
    }

}

