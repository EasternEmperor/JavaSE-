package com.easterne.javase.thread;

/**
 * 让位，让当前线程暂停，回到就绪状态，占有的时间片剩余时间让给其他线程：
 *      静态方法：Thread.yield()
 */
public class ThreadTest10 {

    public static void main(String[] args) {
        MyRunnable4 mr = new MyRunnable4();
        Thread t = new Thread(mr);
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }

}

class MyRunnable4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 当i整除2时就让位
            if (i % 3 == 0)
                Thread.yield();
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
