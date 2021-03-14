package com.easterne.javase.thread;

/**
 * 实现线程的第一种方式：
 *      编写一个类，直接继承java.lang.Thread，重写run方法
 *      // 定义线程类
 *      public class MyThread extends Thread {
 *          public void run() {
 *
 *          }
 *      }
 *      // 创建线程对象
 *      MyThread t = new MyThread();
 *      // 启动线程
 *      t.start();
 *
 *      怎么创建线程对象？new就行了
 *      怎么启动线程？ 调用线程对象的start()方法
 *
 * 注意：
 *      亘古不变的道理：
 *          方法体中的代码永远是自上而下的顺序依次逐行执行的！
 */
public class ThreadTest02 {

    public static void main(String[] args) {
        // 这里是main方法，这里的代码属于主线程，在主栈中运行

        // 新建一个分支线程对象
        MyThread myThread = new MyThread();

        // 启动线程

        // 注意：直接调用run()方法不会启动线程！只会在主栈中压栈run()方法！
        //myThread.run();

        /**
         * start()方法的作用是：
         *      启动一个分支线程，在JVM中开辟新的栈空间。这段代码任务完成后，瞬间就结束了！
         *      启动成功的分支线程会自动调用run()方法，并且run()方法在分支栈的底部（第一个压栈）
         * run()方法在分支栈的底部，main()方法在主栈的底部，run和main是平级的
         */
        myThread.start();

        // 这里的代码还是在主栈中运行
        for (int i = 0; i < 100; i++)
            System.out.println("主线程--->" + i);
    }

}

// 自定义线程类（注意一定要重写run()方法）
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // currentThread就是当前线程对象
            // 当mt1线程执行run方法，那么这个当前线程就是mt1
            // 当mt2线程执行run方法，那么这个当前线程就是mt2
            Thread ct = Thread.currentThread();
            System.out.println(ct.getId() + ":" + ct.getName() + "--->" + i);
        }
    }
}
