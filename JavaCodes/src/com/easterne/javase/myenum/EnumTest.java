package com.easterne.javase.myenum;

import java.util.Scanner;

/**
 * 枚举类型：
 *      也是引用类型，编译后生成.class 文件
 */
public class EnumTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入两个数：");
        int a = input.nextInt();
        int b = input.nextInt();
        result r = divide(a, b);
        System.out.println(r == result.SUCCESS ? "计算成功" : "计算失败");
    }

    /**
     * 判断两数是否可以进行除法计算
     * @param a 被除数
     * @param b 除数
     * @return  枚举类型SUCCESS、FAIL，表示计算是否成功
     */
    public static result divide(int a, int b) {
        try {
            int c = a / b;
            return result.SUCCESS;
        } catch (Exception e) {
            return result.FAIL;
        }
    }

}


enum result {
    // 计算是否成功
    SUCCESS, FAIL
}
