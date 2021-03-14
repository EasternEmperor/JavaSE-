package com.easterne.javase.thread.waitnotify;

import java.util.ArrayList;
import java.util.List;

/**
 * 作业：
 *      两个线程交替输出数字，且t1输出奇数，t2输出偶数
 */
public class HomeWork {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        Thread t1 = new Thread(new T1(list));
        Thread t2 = new Thread(new T2(list));
        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();

    }

}

class T1 implements Runnable {
    private List<Integer> list;

    public T1(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                // 如果此时数为偶数，则进入等待
                if (list.get(0) % 2 == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 到这里表示数为奇数，则输出，并将其++
                System.out.println(Thread.currentThread().getName() + "-->" + list.get(0));
                // 再将其中的值+1
                list.set(0, list.get(0) + 1);
                // 唤醒t2
                list.notify();
            }
        }
    }
}

class T2 implements Runnable {
    private List<Integer> list;

    public T2(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            // 对integer进行同步操作
            synchronized (list) {
                // 如果数为奇数，则t2进入等待，直到为偶数
                if (list.get(0) % 2 == 1) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 到这里表明数为偶数，将其输出，并++
                System.out.println(Thread.currentThread().getName() + "-->" + list.get(0));
                list.set(0, list.get(0) + 1);

                // 消费后要唤醒生产者进行生产
                list.notify();
            }
        }
    }
}

