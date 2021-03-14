package com.easterne.javase.thread.waitnotify;

import java.util.ArrayList;
import java.util.List;

/**
 * 1、使用wait()和notify()方法实现“生产者和消费者模式”
 *
 * 2、什么是“生产者和消费者模式”？
 *      生产线程负责生产，消费线程负责消费
 *      生产线程和消费线程要达到均衡
 *      这是一种特殊的业务模式，需要使用到wait()和notify()方法
 *
 * 3、wait()和notify()方法不是线程对象的方法，是普通java对象都有的方法
 *
 * 4、wait()和notify()方法建立在线程同步的基础上。
 *      因为生产者和消费者要同时操作一个仓库，有线程安全问题。
 *
 * 5、wait()方法：o.wait()让正在o对象上活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁
 *
 * 6、notify()方法：o.notify()唤醒正在o对象上等待的线程，只是通知，不会释放o对象上已被占有的锁
 *
 * 7、模拟这样一个需求：
 *      仓库使用list集合，且只能存储1个元素
 *      即：生产1个，消费1个
 */
public class PCTest {

    public static void main(String[] args) {

        List list = new ArrayList();
        Thread producer = new Thread(new Producer(list));
        Thread consumer = new Thread(new Consumer(list));
        producer.setName("生产者");
        consumer.setName("消费者");

        producer.start();
        consumer.start();

    }

}

class Producer implements Runnable {
    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 因为是生产和消费是循环往复的，所以设置死循环
        int i = 0;
        while (true) {
            // 这里要对list进行同步操作，使用synchronized上锁
            synchronized (list) {
                // 仓库满了，则生产者停止生产
                if (list.size() > 0) {
                    try {
                        // 因为仓库满了，所以生产者进入等待，并释放手中的list锁
                        // 让消费者去消费
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 仓库空了，则生产者要再度生产
                String s = i + "号商品";
                i++;
                list.add(s);
                System.out.println(Thread.currentThread().getName() + "-->" + s);
                // 生产完成，则唤醒消费者进行消费
                // 生产者回到wait()状态
                list.notify();
            }
        }
    }
}

class Consumer implements Runnable {
    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        // 死循环进行消费
        while (true) {
            // 对list进行同步操作
            synchronized (list) {
                // 如果仓库空了，则消费者进入等待，直到生产者生产了
                if (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 仓库中有物品，则消费者进行消费
                Object s = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "-->" + s);
                // 消费后要唤醒生产者进行生产
                list.notify();
            }
        }
    }
}

