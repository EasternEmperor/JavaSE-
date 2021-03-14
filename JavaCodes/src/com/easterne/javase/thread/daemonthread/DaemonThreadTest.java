package com.easterne.javase.thread.daemonthread;

/**
 * 守护线程(Daemon Thread)的设置：
 *      thread.setDaemon(true)
 *          将thread线程设置为守护线程！
 */
public class DaemonThreadTest {

    public static void main(String[] args) {
        Thread thread = new BackThread();
        thread.setName("守护线程");
        thread.setDaemon(true);
        thread.start();

        // 主线程：main（即用户线程）
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


class BackThread extends Thread {
    public void run() {
        int i = 0;
        // 用户线程结束则守护线程会自动结束，尽管是死循环！
        while (true) {
            System.out.println(Thread.currentThread().getName() + "-->" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
