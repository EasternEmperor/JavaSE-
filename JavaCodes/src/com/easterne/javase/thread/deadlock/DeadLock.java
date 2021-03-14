package com.easterne.javase.thread.deadlock;

/**
 * 死锁很难调试，可以注意以下死锁代码
 *
 * 所以注意：不要使用嵌套synchronized！
 */
public class DeadLock {

    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new MyThread1(o1, o2);
        Thread t2 = new MyThread2(o1, o2);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }

}


class MyThread1 extends Thread {
    Object o1;
    Object o2;

    public MyThread1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o1) {
            System.out.println(Thread.currentThread().getName() + "锁住o1对象");
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "锁住o2对象");
            }
        }
    }
}

class MyThread2 extends Thread {
    Object o1;
    Object o2;

    public MyThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    public void run() {
        synchronized (o2) {
            System.out.println(Thread.currentThread().getName() + "锁住o2对象");
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "锁住o1对象");
            }
        }
    }
}
