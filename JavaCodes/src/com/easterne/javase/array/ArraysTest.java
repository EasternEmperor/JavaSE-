package com.easterne.javase.array;

import java.util.Arrays;

/**
 *
 * 常见的算法：
 *      排序算法：
 *          冒泡排序算法
 *          选择排序算法
 *      查找算法：
 *          二分查找算法
 *
 * java中的数组工具类：java.util.Arrays
 *      其中包括以上的常见算法，不太清楚的话记得参考帮助文档
 *
 * Arrays工具类的使用：sort
 */
public class ArraysTest {

    public static void main(String[] args) {
        int[] a = {112, 23, 45, 12, 556};

        Arrays.sort(a);

        // 遍历输出排序后的a
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

}
