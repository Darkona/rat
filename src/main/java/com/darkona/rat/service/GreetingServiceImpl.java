package com.darkona.rat.service;

import com.darkona.rat.model.Greeting;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class GreetingServiceImpl implements GreetingService{


    public Greeting greet(String name){
        log.info("Greeting " + name);
        return new Greeting(name);
    }

}
