package com.darkona.rat.controller;


import com.darkona.rat.service.GreetingService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
    public String home(){
        log.debug("Called get method for home.");
        return "index.jsp";
    }

    @GetMapping(value = "/greet",produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> greet(@RequestParam(name = "name", defaultValue = "") String name){
        log.info("Called get method for greet.");
        return new ResponseEntity<String>(greetingService.greet(name).getGreeting(), HttpStatus.OK);

    }
}
