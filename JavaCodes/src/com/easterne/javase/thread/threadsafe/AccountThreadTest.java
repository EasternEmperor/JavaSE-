package com.easterne.javase.thread.threadsafe;

public class AccountThreadTest {

    public static void main(String[] args) {
        Account account = new Account("act01", 10000);
        Thread t1 = new Thread(new AccountThread(account));
        Thread t2 = new Thread(new AccountThread(account));

        t1.setName("t1");
        t2.setName("t2");

        // 启动取款
        t1.start();
        t2.start();

    }

}
