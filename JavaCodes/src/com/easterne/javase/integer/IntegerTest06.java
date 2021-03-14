package com.easterne.javase.integer;

/**
 * 整数型常量池的概念，在05中有描述
 */
public class IntegerTest06 {

    public static void main(String[] args) {

        /**
         * java中为了提高程序的执行效率，将[-128, 127]之间所有的包装对象都提前创建好
         * 了，放到了一个方法区的”整数型常量池“中，目的是只要用这个区间的数据不用再重新new
         * 了，直接从整数型常量池中取出来
         *
         * 原理：i1变量中保存的对象的内存地址和i2中保存的对象的内存地址是一样的
         */
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("i1 == i2: " + (i1 == i2));  // true


    }

}
