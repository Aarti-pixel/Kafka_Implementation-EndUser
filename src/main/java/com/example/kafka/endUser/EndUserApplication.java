package com.example.kafka.endUser;

import com.example.kafka.endUser.config.AppConstants;
import org.apache.kafka.common.internals.Topic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class EndUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndUserApplication.class, args);
	}

    private Logger logger= LoggerFactory.getLogger(EndUserApplication.class);

    @KafkaListener(topics = AppConstants.TOPICNAME,groupId = AppConstants.GroupId)
    private String updatedMessage(String message){
        System.out.println("before message"+message);
        return message;
       }

}
