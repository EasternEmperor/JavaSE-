package com.easterne.javase.thread.threadsafe;

/**
 * 银行账户
 *      使用线程同步机制，解决线程安全问题
 */
public class Account {
    // 帐号
    private String actno;
    // 余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void withdraw(double money) {

        /**
         * 为使线程同步执行，使用synchronized代码块
         * synchronized()中，要传入的参数为：
         *      要同步执行的线程的共享对象！
         * 这里t1和t2的共享对象就是account，即this
         *
         * synchronized()代码块原理：
         *      1、假设t1和t2线程并发，开始执行以下代码时，肯定有先后关系
         *      2、假设t1先执行，遇到synchronized，会自动找”共享对象“（即
         *      参数）的对象锁，之后占有这把锁，直到synchronized()代码块执
         *      行结束，才释放对象锁
         *      3、如果t1已经占有”共享对象“的对象锁，t2也遇到synchronized，
         *      也会去找”共享对象“的对象锁，而此时对象锁被t1占有，t2只能在共享
         *      代码块前等待t1结束，才能进入同步代码块执行程序
         *
         * 所以重点在于：选好synchronized()代码块的共享对象！只要是两个线程共享
         * 的对象，就可以作为参数上锁。比如在Account中还有一个变量：Object obj = new Object();
         * 那么这里也可以改为：synchronized(Obj){
         * }
         *
         * synchronized关键字也可以用在实例方法上，表示调用方法时要进入锁池，这种方法由于扩大了范围，
         * 效率较低，不常用。具体参见StringBuffer、Vector、Hashtable的实例方法。
         */

        synchronized (this) {
            double after = this.balance - money;    // 取钱后的余额
            // 线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.setBalance(after);
        }
    }
}
