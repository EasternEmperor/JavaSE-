package com.easterne.javase.array;

/**
 * 关于java的二维数组：
 *      1、二维数组其实是一个特殊的一维数组，特殊在这个一维数组的每个元素都是一个一维数组
 *
 *      2、三维数组是什么？
 *          三维数组是一个特殊的二维数组，特殊在这个二维数组的每个元素都是一个一维数组
 *
 *      3、二维数组的初始化：
 *          - 二维数组静态初始化：
 *              int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
 *          - 二维数组动态初始化：
 *              int[][] b = new int[3][4];  // 其中元素默认为0
 *
 *
 *      4、二维数组名调用length：返回值是二维数组中的一维数组个数
 *
 *      5、不管如何，注意下标别越界！
 */
public class ArrayTest07 {

    public static void main(String[] args) {
        int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println(a[0]);       // 引用对象的地址
        System.out.println(a.length);   // 3

        // 二维数组的读和取
        // 新发现：可以用中文作为变量名
        int[] 第1个一维数组 = a[0];
        int 第1个一维数组的第1个元素 = 第1个一维数组[0];
        System.out.println(第1个一维数组的第1个元素);

        // 二维数组的遍历
        System.out.println("二维数组的遍历：");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }

}
