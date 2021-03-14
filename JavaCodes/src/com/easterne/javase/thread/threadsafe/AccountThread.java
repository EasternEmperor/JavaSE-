package com.easterne.javase.thread.threadsafe;

public class AccountThread implements Runnable {
    // 要操作的账户
    private Account account;

    public AccountThread(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        double money = 5000;
        account.withdraw(money);
        System.out.println(Thread.currentThread().getName() + "线程对账户" +
                account.getActno() + "操作取款：" + money + "，" + "余额：" +
                account.getBalance());
    }
}
