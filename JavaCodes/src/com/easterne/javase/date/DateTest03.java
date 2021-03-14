package com.easterne.javase.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date类的Date(long date)构造方法：
 *      date是指自1970.1.1 00:00:00 000到要计算的时间的毫秒数
 *      即传入一个毫秒数
 */
public class DateTest03 {

    public static void main(String[] args) {

        // 下面代码表示的时间是什么时候？
        // 格林尼治时间：1970.1.1 00:00:00 001
        Date time1 = new Date(1);
        // 为什么是08:00:00 001？
        // 因为北京位于东八区，比格林尼治时间早8h
        System.out.println(time1);      // Thu Jan 01 08:00:00 CST 1970

        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSSS");
        String nt = sdf.format(time1);
        System.out.println(nt);         // 1970-01-01 08:00:00 0001


        // 获取昨天此时的时间
        // 先获取今天的时间，然后减去一天的24h（转化为ms数）
        Date time2 = new Date(System.currentTimeMillis() - 24 * 3600000);
        String nt2 = sdf.format(time2);
        System.out.println(nt2);        // 2021-02-16 20:55:16 0739
    }

}
