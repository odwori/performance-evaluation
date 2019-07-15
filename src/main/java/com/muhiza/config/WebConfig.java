package com.muhiza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = ("com.muhiza.controller"))
//public class WebConfig extends WebMvcConfigurationSupport {
//
//}
public class WebConfig implements WebMvcConfigurer{
	
}
