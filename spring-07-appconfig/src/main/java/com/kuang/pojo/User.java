package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 这里这个注解的意思，就是说明这个类被spring接管了，注册到容器中
@Component
public class User {
    private  String name;

    public String getName() {
        return name;
    }


    @Value("二狗蛋")      // 这里我们先注入一个值，相当于赋值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
