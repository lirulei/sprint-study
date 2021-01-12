package com.kuang.pojo;

public class User {
    private String name;
    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public User(String name, String school) {
        this.name = name;
        this.school = school;
    }

//    public User() {
//        System.out.println("输出的是：User的无参构造");
//    }
//
//    public User(String name) {
//        this.name = name;
//    }
//
//    public User(String school) {
//        this.school = school;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showname() {
        System.out.println("姓名 ==> " + this.name);
    }

    public void showschool() {
        System.out.println("学校 ==> " + this.school);
    }


}
