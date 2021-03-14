package com.easterne.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java对日期的处理：
 *      1、如何获取当前系统时间？
 *          使用Date的无参数构造方法即可
 *
 *      2、Date和String的互相转化，以及SimpleDateFormat类的使用
 */
public class DateTest {

    public static void main(String[] args) throws Exception {
        // 获取系统当前时间（精确到ms的系统当前时间）
        // 直接调用无参数构造方法
        Date nowTime = new Date();
        // 注：Date重写了toString()方法
        //System.out.println(nowTime);    // Wed Feb 17 16:55:56 CST 2021

        // 如何为输出的日期确定格式？
        // SimpleDateFormat是java.text包下，专门负责日期格式化的类
        /**
         * 格式化方式（以下示例）：
         *  yyyy    年（显示4位）
         *  MM      月（显示两位）
         *  dd      日（显示两位）
         *  HH      时（显示两位）
         *  mm      分（显示两位）
         *  ss      秒（显示两位）
         *  SSS     毫秒（显示三位）
         */
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");
        String nt = simpleDateFormat.format(nowTime);
        System.out.println(nt);     // 2021-02-17 17:08:08 0404


        // 将一个时间格式的字符串转换为Date类
        // String -> Date
        String s = "2021-02-17 17:08:08 0404";
        // 仍利用SimpleDateFormat类，注意此时构造方法中的日期格式要与String中的日期格式一致！
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");
        Date dateTrans = sdf.parse(s);
        System.out.println(dateTrans);      // Wed Feb 17 17:08:08 CST 2021
    }

}
