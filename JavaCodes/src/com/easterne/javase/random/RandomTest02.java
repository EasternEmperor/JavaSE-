package com.easterne.javase.random;

import java.util.Random;
import java.util.Scanner;

/**
 * 生成x个不同的随机数，可指定范围
 */
public class RandomTest02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("要生成多少个随机数？");
        // 读取个数
        int num = scanner.nextInt();

        System.out.println("这些随机数的范围呢？");
        System.out.print("上限：");
        int upper = scanner.nextInt();
        System.out.print("下限：");
        int floor = scanner.nextInt();

        int[] randomNum = new int[num];     // 默认为0
        int index = 0;      // 下标
        while(index < num) {
            Random random = new Random();
            int rn = random.nextInt(upper - floor + 1);
            // 查重
            int flag = 0;       // 判断是否重复
            for (int j = 0; j < index; j++) {
                if (randomNum[j] - floor == rn) {
                    flag = 1;   // 1表示有重复
                    break;
                }
            }
            if (flag == 1) {
                continue;
            }


            // 到这一步则表明没有重复，将rn加入数组
            // 同时下标后移一位
            randomNum[index++] = rn + floor;
        }

        // 打印出来
        print(randomNum);
    }

    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

}
