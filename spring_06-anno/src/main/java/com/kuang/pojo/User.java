package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")  // 显式定义是一个单例模式
public class User {
//    public String name = "马斯克";

    // 这个注解的作用： 等价于 public String name = "马斯克";
    @Value("马斯克")
    public String name ;


}
