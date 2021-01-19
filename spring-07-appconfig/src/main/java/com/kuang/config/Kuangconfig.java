package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Kuangconfig {

   @Bean
    public User getUser() {
        return new User();
    }

}
