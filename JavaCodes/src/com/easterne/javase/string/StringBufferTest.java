package com.easterne.javase.string;

/**
 * 思考：我们在实际开发中，如果需要进行字符串的频繁拼接，会有什么问题？
 *      因为java中的字符串是不可变的，每一次拼接都会产生新字符串。
 *      这样会占用大量的方法区内存。造成内存空间的浪费。比如：
 *          String s = "abc";
 *          s += "hello";
 *      就以上两行代码，就导致方法区字符串常量池中创建了3个对象：
 *          "abc"
 *          "hello"
 *          "abchello"
 *
 * 如果以后需要进行大量的字符串拼接操作，建议使用JDK中自带的：
 *      java.lang.StringBuffer
 *      java.lang.StringBuilder
 *
 * String和以上两种类的区别是：String有final修饰，所以不能改变
 *
 * 如何优化StringBuffer的性能？
 *      在创建StringBuffer时尽可能给定一个大一点的初始化容量，
 *      减少底层数组的扩容次数。
 */
public class StringBufferTest {

    public static void main(String[] args) {
        // 创建一个初始化容量为16的byte[] 数组（字符串缓冲区对象）
        StringBuffer stringBuffer = new StringBuffer();

        // 拼接字符串，统一使用 append() 方法
        // append() 在stringBuffer满了之后，会自动扩容
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("d");
        stringBuffer.append(3.14);
        stringBuffer.append(100L);
    }

}
