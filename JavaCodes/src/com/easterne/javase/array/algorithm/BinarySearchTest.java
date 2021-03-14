package com.easterne.javase.array.algorithm;

/**
 * 二分查找算法：
 *      前提是数据已排好序
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        int[] a = new int[10];
        // 生成排好序的数组：长度10
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }

        // 测试二分查找方法
        BinarySearch(a, 8);
        BinarySearch(a, 10);
        BinarySearch(a, 2);
    }

    // 二分查找：
    public static int BinarySearch(int[] a, int des) {
        // 二分查找
        int start = 0, end = a.length - 1;  // 二分查找的第一个区间
        int mid = (start + end) / 2;        // 中间点
        while (start < end) {
            // 如果中间数小于目标数，则区间缩小至：[mid, end]
            if (a[mid] < des) {
                start = mid + 1;
                mid = (start + end) / 2;
            }
            // 如果中间数大于目标数，则区间缩小至：[start, mid]
            else if (a[mid] > des) {
                end = mid - 1;
                mid = (start + end) / 2;
            }
            // 如果相等，则查找成功，返回下标结束方法
            else {
                System.out.println(des + "下标为：" + mid);
                return mid;
            }
        }

        // 如果到这一步，则表明未找到目标数
        System.out.println(des + "不在该数组中！");
        return -1;
    }

}
