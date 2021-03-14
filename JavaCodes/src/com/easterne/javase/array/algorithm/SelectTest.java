package com.easterne.javase.array.algorithm;

/**
 * 选择排序：
 *      每次从这堆参与比较的数据当中找出最小值，
 *      拿着这个”最小值“和”参与比较的数据中最前面的元素“交换位置
 * 选择排序比起冒泡排序的优点：
 *      每次交换都是有意义的！
 *      因为冒泡排序交换过后，可能左边的数仍比右边的数大！
 *
 * 示例：
 * 参与比较的数据：3 1 6 2 5
 * 第1次循环之后的结果：
 *      1 3 6 2 5
 *
 * 参与比较的数据：3 6 2 5
 * 第2次循环之后的结果：
 *      2 6 3 5
 *
 * 参与比较的数据：6 3 5
 * 第3次循环之后的结果：
 *      3 6 5
 *
 * 参与比较的数据：6 5
 * 第4次循环之后的结果：
 *      5 6
 *
 * 注意：5个数据，循环4次
 */
public class SelectTest {

    public static void main(String[] args) {
        int[] a = {3, 1, 6, 2, 5};

        // 选择排序：外循环次数是数组长度 - 1！
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i], no = i;

            // 先设置一个最小值，通过第二层循环找到最小的数
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    no = j;     // 记录序号
                }
            }
            // 将最小数调至当前比较数据的最前面
            a[no] = a[i];
            a[i] = min;

            // 打印此时，验证算法正确性
            print(a);
        }
    }

    // 打印数组
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
