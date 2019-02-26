package com.muhiza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages=("com.muhoza.controller"))
public class WebConfig extends WebMvcConfigurationSupport {

}
