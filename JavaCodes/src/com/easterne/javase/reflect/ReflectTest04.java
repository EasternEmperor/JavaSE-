package com.easterne.javase.reflect;

/**
 * 研究一下，Class.forName()发生了什么？
 *      通过以下代码可知，Class.forName()会导致类加载
 *      重点：
 *          如果你只希望一个类的静态代码块执行，其他代码一律不执行
 *          可以使用：
 *              Class.forName("完整类名");
 */
public class ReflectTest04 {

    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.easterne.javase.reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}

class MyClass {

    // 静态代码块，仅在类加载时执行1次！
    static {
        System.out.println("MyClass的静态代码块执行！");
    }

}
