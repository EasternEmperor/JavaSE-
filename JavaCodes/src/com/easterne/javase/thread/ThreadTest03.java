package com.easterne.javase.thread;

/**
 * 实现线程的第二种方式：
 *      编写一个类实现java.lang.Runnable接口
 *      // 定义一个可运行的类
 *      public class MyRunnable implements Runnable {
 *          public void run() {
 *
 *          }
 *      }
 *      // 创建线程对象
 *      Thread t = new Thread(new MyRunnable());
 *      // 启动线程
 *      t.start();
 */
public class ThreadTest03 {

    public static void main(String[] args) {
        // 创建一个可运行的对象
        //MyRunnable mr = new MyRunnable();
        // 将可运行对象封装成线程对象
        //Thread t = new Thread(mr);
        // 可将其合并为一行
        Thread t = new Thread(new MyRunnable());

        // 启动线程
        t.start();

        // 这里的代码还是在主栈中运行
        for (int i = 0; i < 100; i++)
            System.out.println("主线程--->" + i);

    }

}


class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("分支线程--->" + i);
    }
}
