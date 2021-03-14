package com.easterne.javase.random;

import java.util.Random;

/**
 * 生成随机数：
 *      java.util.Random
 */
public class RandomTest {

    public static void main(String[] args) {
        // 创建随机数对象
        Random r = new Random();

        // 随机生成一个int类型取值范围内的随机数
        int num1 = r.nextInt();
        System.out.println(num1);

        // 随机生成一个[0, 100]内的随机数，注意不能生成101及大于101的数！
        int num2 = r.nextInt(101);
        System.out.println(num2);
    }

}
