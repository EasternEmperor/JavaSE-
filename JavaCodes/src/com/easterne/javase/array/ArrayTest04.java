package com.easterne.javase.array;

/**
 * main函数的参数：String[] args的含义
 *
 * IDEA中的args参数设置在：
 *      运行 -> 编辑配置 -> 程序参数
 */
public class ArrayTest04 {

    public static void main(String[] args) {
        // JVM默认传递的args数组长度？
        System.out.println("JVM传递过来的String数组参数，它的数组长度：" + args.length);

        // args数组是留个用户传入参数的
        // 例如运行时指令为：java ArrayTest04 abc def ghi
        // 此时JVM会将"abc def ghi"通过空格的方式进行分离，分离完成后放到args数组中
        // 可以尝试使用以上指令来运行，并遍历输出
        ArrayTest03.printArray(args);
    }

}
