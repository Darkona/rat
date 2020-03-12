package com.darkona.rat.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc

@ComponentScan (basePackages = {"com.darkona.rat"})
public class WebMvcConfig implements WebMvcConfigurer {



}
