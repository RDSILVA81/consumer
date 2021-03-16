package com.mq.consumer.service;

import com.mq.consumer.config.ConsumerConfiguration;
import com.mq.consumer.dto.People;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = ConsumerConfiguration.QUEUE)
    public void consumer(String people){
        System.out.println(people);
    }
}
