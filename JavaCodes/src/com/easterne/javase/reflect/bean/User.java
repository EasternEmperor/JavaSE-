package com.easterne.javase.reflect.bean;

public class User {
    public User() {
        System.out.println("调用无参构造方法！");
    }

    public User(String s) {
        System.out.println("调用有参构造方法！");
    }
}
