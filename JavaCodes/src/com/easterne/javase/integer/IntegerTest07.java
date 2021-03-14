package com.easterne.javase.integer;

/**
 * 总结之前遇到的经典异常：
 *      空指针异常       NullPointerException
 *      类型转换异常      ClassCastException
 *      数组下标越界异常    ArrayIndexOutOfBoundsException
 *      数字格式化异常     NumberFormatException
 *
 * 以下学习Integer包装类中的常用方法：
 *      1、static int parseInt(String s)：
 *          静态方法，将传入的字符串转换为数字
 *
 *      2、static String toBinaryString(int i)：
 *          静态方法，将传入的十进制数转换为二进制数，并以字符串的形式返回
 *
 *      3、static Integer valueOf(int i)或static Integer valueOf(String s)：
 *          静态方法，将传入的int或String值创建出Integer对象，并返回其内存地址
 *
 */
public class IntegerTest07 {

    public static void main(String[] args) {
        // 1、static int parseInt(String s)
        int ret = Integer.parseInt("123");
        System.out.println(ret);

        // 2、static String toBinaryString(int i)
        String s = Integer.toBinaryString(5);
        System.out.println(s);

        // 3、static Integer valueOf(int i)
        //      或 static Integer valueOf(String s)
        Integer i1 = Integer.valueOf(10);
        System.out.println(i1);
        Integer i2 = Integer.valueOf("10");
        System.out.println(i2);
    }

}
