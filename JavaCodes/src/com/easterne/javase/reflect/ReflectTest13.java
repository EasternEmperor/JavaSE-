package com.easterne.javase.reflect;

/**
 * 重点：
 *      如何获取一个类的父类，和其实现的接口
 */
public class ReflectTest13 {

    public static void main(String[] args) throws ClassNotFoundException {

        // 获取类型
        Class stringClass = Class.forName("java.lang.String");

        // 获取String的父类
        // java中不允许多继承，所以只有1个父类！
        Class superClass = stringClass.getSuperclass();
        System.out.println(superClass.getName());

        // 获取String实现的接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class in : interfaces) {
            System.out.println(in.getName());
        }

    }

}
