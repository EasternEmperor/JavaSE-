package com.easterne.javase.string;

/**
 * 关于java.lang.string：
 *      1、String表示字符串类型，属于引用数据类型，不属于基本数据类型
 *
 *      2、在java中使用双引号括起来的都是String对象。例如："abc"，"def"，这是2个String对象
 *
 *      3、java规定，双引号括起来的字符串是不可变的，也就是说"abc"自出生到被清除，不可变！
 *      此处应分清：对象和引用的区别。对象是字符串本身，而引用是可以改变指向的地址的！
 *
 *      4、在JDK中双引号括起来的字符串，例如："abc""def"都是直接存储在”方法区“的”字符串常量池“
 *      中的。（此处应记住内存图）
 *      为什么要把字符串存储在”字符串常量池中呢？
 *          因为字符串在开发中使用太频繁。为了执行效率，所以把字符串放到了方法区的“字符串常量池”中
 *
 *      5、垃圾回收器不会回收常量 —— 意味着“字符串常量池”中的字符串不会被回收！
 */
public class StringTest {

    public static void main(String[] args) {
        // 这两行代码表示底层创建了3个字符串对象，且都在字符串常量池中
        // 分别是："abc" "xy" "abcxy"
        String s1 = "abc";
        String s2 = "abc" + "xy";

        // 分析：这是使用new的方式创建的字符串对象。代码中的"xy"是使用字符串常量池中的对象
        // 凡是双引号括起来的都在字符串常量池中有一份
        // new对象的时候一定会在堆内存开辟空间
        /* 所以下面这行代码有：
                - s3：栈内存中，指向new的堆内存对象
                - new：堆内存中，创建对象指向方法区的字符串常量池中的"xy"字符串对象
                - "xy"：方法区内存中的字符串常量池中
         */
        String s3 = new String("xy");
    }

}
