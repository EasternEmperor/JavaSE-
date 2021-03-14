package com.easterne.javase.array;

/**
 * 将数组作为形参传入方法：多种写法
 */
public class ArrayTest03 {

    public static void main(String[] args) {

        // Java写法
        int[] a1 = new int[5];
        printArray(a1);
        // C++写法
        int a2[] = new int[5];
        printArray(a2);

        String[] s = new String[5];
        printArray(s);

        System.out.println("==============================");
        printArray(new int[5]);
        // 静态初始化的数组
        printArray(new int[] {1, 2, 3});

    }

    // 打印数组内容
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
    public static void printArray(String[] s) {
        for (int i = 0; i < s.length; i++)
            System.out.println("s[" + i + "] = " + s[i]);
    }


}
