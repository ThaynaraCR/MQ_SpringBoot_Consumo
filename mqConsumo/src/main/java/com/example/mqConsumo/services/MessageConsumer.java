package com.example.mqConsumo.services;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "youtube")
    public void listener(String name){
        System.out.println("The name sent from de queue youtube is: "+name);
    }
    
}
