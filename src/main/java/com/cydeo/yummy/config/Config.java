package com.cydeo.yummy.config;

import com.cydeo.yummy.service.impl.share.FaceBookShareServiceImpl;
import com.cydeo.yummy.service.impl.share.InstagramShareServiceImpl;
import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.cydeo.yummy")
@Configuration
public class Config {
    @Bean
    public Faker getFaker(){
        return new Faker();
    }
}
