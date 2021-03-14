package com.easterne.javase.thread.threadsafe;

/**
 * 以下程序，t2是否要等待t1结束后再执行？
 *      不用等待！因为只有doSome()方法被synchronized修饰，
 *      即共享代码块只有doSome()，doOther()不共享！
 *
 * 注意：这里synchronized修饰实例方法，表示this对象被共享，t1调用时会给该对象上锁，
 *      由于t2调用的方法doOther()不用锁便可执行（没有synchronized修饰），所以不
 *      用等待！
 *
 * 测试2：
 *      如果doOther()也被synchronized修饰呢？t2是否需要等待t1结束？
 *          需要！因为由于t2调用doOther()也要锁，而此时锁被t1上了，所以t2要等待！
 *
 * 测试3：
 *      如果t1和t2传入的MyClass对象分别是mc1和mc2呢？t2需要等待t1结束吗？
 *          不需要！因为对象锁有2个，t1锁的是mc1，t2锁的是mc2
 *
 * 测试4：
 *      在测试3的基础上，如果doSome()和doOther()都是静态方法呢？t2需要等待t1结束吗？
 *          需要！因为类锁只有1个！虽然对象不同，但是t1和t2共享类锁！
 */
public class Exam {

    public static void main(String[] args) throws InterruptedException {
        MyClass mc = new MyClass();
        Thread t1 = new MyThread(mc);
        Thread t2 = new MyThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);
        t2.start();

    }

}

class MyThread extends Thread {
    private MyClass mc;
    public MyThread(MyClass mc) {
        this.mc = mc;
    }

    public void run() {
        if (Thread.currentThread().getName().equals("t1"))
            mc.doSome();
        if (Thread.currentThread().getName().equals("t2"))
            mc.doOther();
    }
}

class MyClass {
    public synchronized void doSome() {
        System.out.println("DoSome begin!");
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("DoSome over!");
    }

    public void doOther() {
        System.out.println("DoOther begin!");
        System.out.println("DoOther Over!");
    }
}
