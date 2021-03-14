package com.easterne.javase.integer;

/**
 *  * 总结：int、String和Integer三者之间的互相转化
 *  *      int -> String：
 *  *              - 数字 + "";
 *  *              - String.valueOf(int)
 *  *      String -> int：
 *  *              - Integer.parseInt(String)
 *  *      int -> Integer：
 *  *              - 自动装箱
 *  *              - Integer.valueOf(int)
 *  *      Integer -> int：
 *  *              - 自动拆箱
 *  *              - intValue()方法
 *  *      String -> Integer：
 *  *              - Integer.valueOf(String)
 *  *      Integer -> String：
 *  *              - String.valueOf(Object)
 */
public class IntegerTest08 {

    public static void main(String[] args) {
        // String -> int
        int i1 = Integer.valueOf("123");
        System.out.println(i1);     // 123->数字

        // int -> String
        String s1 = i1 + "";
        System.out.println(s1);     // 123->字符串
        String s2 = String.valueOf(i1);
        System.out.println(s2);     // 123->字符串

        // int -> Integer
        // 自动装箱
        Integer in1 = 123;
        Integer in2 = Integer.valueOf(123);
        System.out.println(in1 + in2);      // 246

        // Integer -> int
        // 自动拆箱
        int i2 = in1;
        int i3 = in1.intValue();
        System.out.println(i2 + "" + i3);   // 123123

        // String -> Integer
        Integer in3 = Integer.parseInt("123");
        System.out.println(in3);            // 123

        // Integer -> String
        String s3 = String.valueOf(in3);
        System.out.println(s3);             // 123

    }

}
