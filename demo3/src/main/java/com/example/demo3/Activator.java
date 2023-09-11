package com.example.demo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class Activator {
    @Autowired
    private StudentRepository studentRepository;
    @ServiceActivator(inputChannel = "echoChannel")
    public void print(student data1)
    {
        studentRepository.save(data1);

    }
}
