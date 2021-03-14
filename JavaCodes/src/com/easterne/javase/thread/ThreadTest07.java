package com.easterne.javase.thread;

/**
 * 有时需要主动叫醒一个睡眠中的线程，如何做到呢？
 *      注意：不是中断线程的执行，而是中断线程的睡眠！
 */
public class ThreadTest07 {

    public static void main(String[] args) {

        Thread t = new Thread(new MyRunnable2());
        t.start();      // 休眠1年

        // 希望5秒之后叫醒t线程
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 中断t线程的睡眠（这种中断方式利用了Java的异常处理机制）
        // interrupt()方法执行后，会产生异常，使run()方法中的try..catch跳到catch中执行，从而中断sleep()方法
        t.interrupt();  // 干扰！
    }

}

class MyRunnable2 implements Runnable {

    public void run() {

        try {
            // 休眠一年
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "end!");
    }
}
