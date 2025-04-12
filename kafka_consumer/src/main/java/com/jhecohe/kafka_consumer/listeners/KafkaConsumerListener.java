package com.jhecohe.kafka_consumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"unProgramadorNace"}, groupId = "my-groupId")
    public void listener(String message){
        LOGGER.info("Mensaje recibido, el mensaje es " + message);
    }
}
