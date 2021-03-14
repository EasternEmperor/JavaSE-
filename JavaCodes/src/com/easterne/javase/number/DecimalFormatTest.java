package com.easterne.javase.number;

import java.text.DecimalFormat;

/**
 * 关于数字的格式化：
 *      java.text.DecimalFormat专门负责数字格式化
 */
public class DecimalFormatTest {

    public static void main(String[] args) {

        // java.text.DecimalFormat专门负责数字格式化
        // DecimalFormat df = new DecimalFormat("数字格式");

        /**
         * 数字格式：
         *      # 代表任意数字
         *      , 代表千分位
         *      . 代表小数位
         *      0 代表位数不够时补0
         *
         * 例如：###,###.##
         *      表示加入千分位，并且保留两位小数
         */
        // 保留小数时会自动进位：5进1
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234.5678);
        System.out.println(s);      // 1,234.57

        // 以下表示加入千分位，并且是4位小数，不够时补0
        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        String s2 = df2.format(1234.5);
        System.out.println(s2);     // 1,234.5000
    }

}
