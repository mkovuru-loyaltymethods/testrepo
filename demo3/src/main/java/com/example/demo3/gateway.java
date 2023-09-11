package com.example.demo3;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
public class gateway {


    @MessagingGateway(name = "myGateway", defaultRequestChannel = "inputChannel")
    public interface CustomGateway {

        @Gateway(requestChannel = "echoChannel", replyTimeout = 2, requestTimeout = 200)
        public void print(student data1);
    }
}
