package com.easterne.javase.reflect;

import com.easterne.javase.reflect.bean.UserService;

import java.lang.reflect.Method;

/**
 * 重点：
 *      通过反射机制调用方法！
 */
public class ReflectTest10 {

    public static void main(String[] args) throws Exception {

        // 常规：不使用反射机制，如何调用方法？
        // 创建对象
        UserService us = new UserService();
        /**
         * 调用方法要素分析：
         *      要素1：对象us
         *      要素2：login方法名
         *      要素3：实参列表
         *      要素4：返回值
         */
        boolean loginSF = us.login("admin", "123");
        System.out.println(loginSF == true ? "登陆成功" : "登陆失败");

        // 使用反射机制，如何调用方法？
        // 获取类型
        Class USClass = Class.forName("com.easterne.javase.reflect.bean.UserService");
        // 创建对象
        Object obj = USClass.newInstance();
        // 获取Method
        Method loginMethod = USClass.getMethod("login", String.class, String.class);

        // 调用方法
        /**
         * 还是三要素：对象、方法名、实参列表、返回值
         */
        // 重要方法：invoke()，调用！
        Object retValue = loginMethod.invoke(obj, "admin", "123");
        System.out.println(retValue);       // true

    }

}
