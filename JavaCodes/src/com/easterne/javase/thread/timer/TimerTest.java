package com.easterne.javase.thread.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * java.util.Timer：定时器
 * 有构造方法：   Timer()
 *              Timer(boolean isDaemon)     作为守护线程在后台执行
 *              Timer(String name)          指定线程名字
 *              Timer(String name, boolean isDaemon)
 *
 * 定时调用任务的方法：
 *      void schedule(TimerTask task, Date firstTime, long period)
 *      其中：task为要执行的任务，firstTime为第一次执行的时间，period为时间间隔
 *
 *      TimerTask：
 *          public abstract class TimerTask
 *          extends Object
 *          implements Runnable
 */
public class TimerTest {

    public static void main(String[] args) {

        // 创建定时器对象
        Timer timer = new Timer("定时器1");
        //Timer timer = new Timer(true);    // 守护线程的方式

        // 指定定时任务
        long nowTimeMill = System.currentTimeMillis();
        Date date = new Date(nowTimeMill + 500);
        // 从程序获得的时间 + 500ms 开始执行定时任务
        timer.schedule(new LogTask(), date, 1000 * 5);

    }

}

class LogTask extends TimerTask {

    @Override
    public void run() {
        // 输出的时间格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String strTime = sdf.format(date);

        System.out.println(strTime + ": " + "备份了数据");
    }
}
