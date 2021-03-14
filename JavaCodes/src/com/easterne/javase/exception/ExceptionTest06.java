package com.easterne.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常的两个方法：
 *      String msg = exception.getMessage();
 *      exception.printStackTrace();        // 一般使用这个
 *
 * 异常的追踪信息该怎么看？
 *      从上往下一行一行看
 *      主要问题在自己编写的程序上，不用看SUN公司的代码
 */
public class ExceptionTest06 {

    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            // 打印异常堆栈追踪信息！
            // 实际开发中，建议使用这个。养成习惯！
            e.printStackTrace();        // 这里默认打印出异常的堆栈信息

            /*
            java.io.FileNotFoundException: D:\tencent\副本23.7z (系统找不到指定的文件。)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:219)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:112)
                at com.easterne.javase.exception.ExceptionTest06.m3(ExceptionTest06.java:30)
                at com.easterne.javase.exception.ExceptionTest06.m2(ExceptionTest06.java:26)
                at com.easterne.javase.exception.ExceptionTest06.m1(ExceptionTest06.java:22)
                at com.easterne.javase.exception.ExceptionTest06.main(ExceptionTest06.java:15)
             */
        }

        System.out.println("Hello World");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("D:\\tencent\\副本23.7z");
    }

}
