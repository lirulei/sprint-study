package com.kuang.pojo;

public class User {
    private String name;

    // 构造器方式注入
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // setter方式注入
    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("姓名 ==> " + this.name);
    }


}
