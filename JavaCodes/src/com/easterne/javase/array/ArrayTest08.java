package com.easterne.javase.array;

/**
 * 二维数组作为形参：
 *      1、直接将数组名传入
 *      2、若想省掉数组名：
 *          function(new int[][]{{...}, {...}, {...}});
 */
public class ArrayTest08 {

    public static void main(String[] args) {
        int[][] a = new int[3][4];

        // 1
        printArray(a);
        System.out.println();
        // 2
        printArray(new int[][]{{1, 1}, {2, 2}, {3, 3}});
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

}
