package com.easterne.javase.reflect;

/**
 * 可变长度参数：
 *      int... args     这就是可变长度参数
 *      语法是：类型... 变量名   （注意：一定是3个点）
 *
 *      1、可变长度参数要求的参数个数是：0~N个
 *      2、可变长度参数在参数列表中必须在最后一个位置上，而且可变长度参数只能有一个！
 *      3、可变长度参数可以当作一个数组来看待
 */
public class ArgsTest {

    public static void main(String[] args) {
        m1();
        m1(1);
        m1(1, 2);

        m3(1);
        m3(1, "a");
        m3(1, "a", "b");

        m4("我", "是", "中", "国", "人");
    }

    public static void m1(int... a) {
        System.out.println("m1方法执行！");
    }

    // 编译报错！因为可变长度参数只能有一个，且得在参数列表的最后一个
    //public static void m2(String... args, int... a) {}

    // 只能由1个，并且在最后一位
    public static void m3(int a, String... args) {

    }

    // 当作数组看待
    public static void m4(String... args) {
        // args具有length属性，说明args是一个数组！
        // 可以将可变长度参数作为数组看待
        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

}
