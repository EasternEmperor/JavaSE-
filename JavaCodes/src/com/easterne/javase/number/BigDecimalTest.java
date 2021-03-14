package com.easterne.javase.number;

import java.math.BigDecimal;

/**
 * 1、BigDecimal：属于大数据，精度极高。不属于基本数据类型，属于java对象（引用数据类型）
 *               专门用于财务软件中
 */
public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(100);
        BigDecimal bd2 = new BigDecimal(200);
        BigDecimal bd3 = new BigDecimal(100.001);
        BigDecimal bd4 = new BigDecimal(200.003);

        // 对BigDecimal类中的实例变量进行运算，要使用方法！
        BigDecimal bd5 = bd.add(bd2);
        System.out.println(bd5);        // 300

        bd5 = bd.add(bd3);
        System.out.println(bd5);        // 200.001000000000004774847184307873249053955078125

        bd5 = bd3.add(bd4);
        System.out.println(bd5);        // 300.003999999999990677679306827485561370849609375
    }

}
