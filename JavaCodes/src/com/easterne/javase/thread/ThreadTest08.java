package com.easterne.javase.thread;

/**
 * 在java中如何终止一个线程的执行？
 *      线程对象执行stop()方法：thread.stop()
 *
 * 这种方式的缺点是：容易丢失数据，因为这种方式是直接杀死线程，线程没有保存的数据
 *               将会丢失。不建议使用（已经过时）
 *
 * 如何正常地终止一个线程的执行而不丢失数据？
 *      在线程类中设置标志变量，当标志变量改变时就终止线程执行
 */
public class ThreadTest08 {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable3());
        thread.setName("t");
        thread.start();

        // 使thread分支线程在5秒后停止
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 5秒后终止thread线程
        thread.stop();
    }

}

class MyRunnable3 implements Runnable {

    // 正常终止线程的方法
    //boolean run = true;

    public void run() {
        for (int i = 0; i < 10; i++) {
/*
            // 当run为false时，终止线程
            if (! run)
                return;
 */
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            // 每次循环睡1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

