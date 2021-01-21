package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration  // 这个类也是被spring接管了，注册到容器中
@ComponentScan("com.kuang.pojo")
@Import(Kuangconfig2.class)

public class Kuangconfig {

    // 注册一个bean 就相当于之前在beans.xml中写的一个bean标签
    // 这个方法的名字getUser  ，就相当于bean标签中的id属性
    // 这个方法的返回值 new User() ，就相当于bean标签中的class属性
    @Bean
    public User getUser() {
        return new User();  // return 返回要注入到bean的对象
    }

}
