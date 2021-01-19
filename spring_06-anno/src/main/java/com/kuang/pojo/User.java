package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class User {
//    public String name = "马斯克";

    // 这个注解的作用： 等价于 public String name = "马斯克";
    @Value("马斯克")
    public String name ;


}
