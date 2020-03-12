package com.darkona.rat.model;

import lombok.Data;
import lombok.extern.log4j.Log4j;
import org.springframework.util.StringUtils;


@Data
public class Greeting {

    private static final String GREETING = "Greetings, %s! I'm a rat!\n"+
    " ()()         ____\n" +
    " (..)        /|o  |\n" +
    " /\\/\\       /o|  o|\n" +
    "c\\db/o...  /o_|_o_|   ";

    private static final String NO_NAME = "human";

    private String greeting;

    public Greeting(String name){

        this.greeting = String.format(GREETING, StringUtils.isEmpty(name) ? NO_NAME : name );
    }
}
