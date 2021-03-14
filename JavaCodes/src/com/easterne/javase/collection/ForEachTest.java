package com.easterne.javase.collection;

/**
 * 增强for循环
 */
public class ForEachTest {

    public static void main(String[] args) {
        int[] a = {22, 33, 44, 55, 66};

        // 普通for循环（通过下标遍历）
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        /**
         * 模板
         * for (类型 变量 : 要遍历的) {
         *
         * }
         */


        System.out.println("-------------------------------");
        // 增强for循环（通过元素遍历）
        for (int e : a) {
            System.out.println(e);
        }
    }

}
