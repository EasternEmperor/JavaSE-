package com.easterne.javase.thread;

/**
 * 1、关于线程的sleep方法：
 *      static void sleep(long millis)
 *          1、静态方法：Thread.sleep(100);
 *          2、参数意义是毫秒
 *          3、作用：让当前线程进入休眠，进入”阻塞状态“，放弃占有的CPU时间片，让给其他的线程使用
 *
 * 2、Thread.sleep()方法，可以做到以下效果：
 *      间隔特定的时间，去执行一段特定的代码
 */
public class ThreadTest06 {

    public static void main(String[] args) {

        // 让当前线程休眠5s
        // 当前线程是主线程
/*        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello World");
        */

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);

            // 休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
