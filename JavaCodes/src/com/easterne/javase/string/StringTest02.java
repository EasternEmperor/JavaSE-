package com.easterne.javase.string;

/**
 * 一些面试题：
 *      判断以下程序一共创建了几个对象？
 */
public class StringTest02 {
    public static void main(String[] args) {
        /**
         *      一共创建了3个对象！
         *          - "Hello"1个：在方法区内存的“字符串常量池”中
         *          - new2个：在堆内存中，保存"Hello"字符串在“字符串常量池”的内存地址
         */
        String s1 = new String("Hello");
        String s2 = new String("Hello");
    }
}
