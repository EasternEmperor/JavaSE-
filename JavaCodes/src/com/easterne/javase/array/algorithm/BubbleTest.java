package com.easterne.javase.array.algorithm;

/**
 * 冒泡算法
 */
public class BubbleTest {

    public static void main(String[] args) {
        int[] a = {232, 34, 56, 5, 67};

        // 两层循环
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

}
