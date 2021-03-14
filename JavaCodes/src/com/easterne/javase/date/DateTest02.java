package com.easterne.javase.date;

/**
 * 知识点：
 *      1、获取自1970.1.1 00:00:00 000到当前系统时间的总毫秒数
 *
 *      2、获取一个方法执行时间
 *
 * 简单总结一下System类的相关属性和方法：
 *      System.out                  【out是System类的静态变量】
 *      System.out.println()        【println()方法不是System类的，是PrintStream类的方法】
 *      System.gc()                 建议启动垃圾回收器
 *      System.currentTimeMillis()  获取自1970.1.1 00:00:00 000到当前系统时间的总毫秒数
 *      System.exit(0)              退出JVM
 */
public class DateTest02 {

    public static void main(String[] args) {
        // 获取自1970.1.1 00:00:00 000到当前系统时间的总毫秒数
        long nowTimeMill = System.currentTimeMillis();
        System.out.println(nowTimeMill);

        // 统计一个方法的耗时
        // 在调用方法前记录一个毫秒
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("方法执行总耗时：" + (end - begin) + "ms");
    }

    public static void print() {
        for (int i = 0; i < 1000; i++)
            System.out.println(i);
    }

}
