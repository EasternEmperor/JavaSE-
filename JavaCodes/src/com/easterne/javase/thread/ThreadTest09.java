package com.easterne.javase.thread;

/**
 * Thread类中的一些常用方法：
 *      1、void setPriority(int newPriority)
 *          （实例方法）设置线程的优先级
 *          优先级分类：
 *              - MAX_PRIORITY = 10     // 最高优先级
 *              - NORM_PRIORITY = 5     // 默认优先级
 *              - MIN_PRIORITY = 1      // 最低优先级
 *
 *      2、int getPriority()
 *          （实例方法）获取线程的优先级
 *
 *      3、static void yield()
 *          （静态方法）暂停当前正在执行的线程，并执行其他线程
 *          yield()方法不是阻塞方法。只是让当前线程让位，让给其他线程使用，
 *          而本身回到就绪状态。
 *          注意：回到就绪状态后，仍会抢占时间片
 *
 *      4、void join()
 *          （实例方法）合并线程，使调用该方法的线程先执行，而当前线程进入阻塞，直到
 *          调用join()的线程结束
 *          注意：在内存中，合并的线程栈不会消失。其间关系是：当前线程获得调用join()方法线程的锁（wait）
 *          class MyThread1 extends Thread {
 *              public void doSome() {
 *                  MyTread2 t = new MyThread2();
 *                  t.join();   // 当前线程阻塞，t线程执行，直到t线程结束，当前线程才回到就绪
 *              }
 *          }
 *          class MyThread2 extends Thread {
 *
 *          }
 */
public class ThreadTest09 {

    public static void main(String[] args) {

    }

}
