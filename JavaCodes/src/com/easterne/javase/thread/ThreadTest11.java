package com.easterne.javase.thread;

/**
 * 合并线程：
 *      t.join()，将t线程合并入当前线程，并将t线程的锁交给当前线程，
 *      然后当前线程进入阻塞，直到t线程结束，唤醒当前线程
 */
public class ThreadTest11 {

    public static void main(String[] args) {
        MyRunnable5 mr = new MyRunnable5();
        Thread t = new Thread(mr);
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName() + "-->" + i);

        System.out.println("main end");

    }

}

class MyRunnable5 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++)
            System.out.println(Thread.currentThread().getName() + "-->" + i);
    }
}
