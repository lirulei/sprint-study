package com.kuang.pojo;

public class UserT {
    private String name;

    // 构造器方式注入
    public UserT(String name) {
        System.out.println("UserT被创建了");
    }

    public String getName() {
        return name;
    }

    // setter方式注入
    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name ==> " + this.name);
    }


}
