package com.easterne.javase.thread;

/**
 * 1、设置线程的名字：
 *      setName()
 *      getName()
 *
 * 2、如果没有设置名字，线程的默认名为：
 *      Thread-1
 *      Thread-2
 *      ...
 *
 * 3、获取当前线程对象：
 *      static Thread currentThread();
 */
public class ThreadTest05 {

    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        // 获取线程的名字
        System.out.println(mt1.getName());  // Thread-0
        System.out.println(mt2.getName());  // Thread-1

        // 设置线程的名字
        mt1.setName("mt1");
        mt2.setName("mt2");
        // 重新获取
        System.out.println(mt1.getName());  // mt1
        System.out.println(mt2.getName());  // mt2

        mt1.start();
        mt2.start();

        // 获取当前线程
        for (int i = 0; i < 100; i++) {
            // currentThread就是当前线程对象
            // 当mt1线程执行run方法，那么这个当前线程就是mt1
            // 当mt2线程执行run方法，那么这个当前线程就是mt2
            // 这里是main方法执行
            Thread ct = Thread.currentThread();
            System.out.println(ct.getId() + ":" + ct.getName() + "--->" + i);
        }

    }

}
