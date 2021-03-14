package com.easterne.javase.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现线程的第三种方式：
 *      前两种分别是继承Thread类和实现Runnable接口
 *      第三种则是实现Callable接口
 *
 * 需求：
 *      系统需要一个线程执行完后返回结果，此时可以通过实现Callable接口
 *      来达到返回结果的效果
 *
 * 步骤：
 *      第一步：创建一个未来任务对象FutureTask
 *      第二步：创建线程对象，将FutureTask对象作为参数传入
 *      第三步：线程对象.start()
 */
public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建未来任务对象
        // 这里使用匿名内部类的方式
        FutureTask task = new FutureTask(new Callable() {
            @Override
            // call()方法相当于run()方法
            public Object call() throws Exception {
                // 线程执行任务，完成后可能会有一个执行结果
                // 模拟执行
                System.out.println("call method begin!");
                Thread.sleep(1000 * 3);
                System.out.println("call method over!");
                int a = 100;
                int b = 200;
                return a + b;   // 自动装箱
            }
        });

        // 创建线程对象
        Thread thread = new Thread(task);

        // 线程启动
        thread.start();

        // 获取结果：task.get()
        // 这里会导致当前线程阻塞，因为要等待返回值需要等待task执行结束才能得到！
        // 所以会降低效率
        Object obj = task.get();

        System.out.println(obj);

        // 这句一定是最后执行，因为当前线程要等待task执行结束
        System.out.println("Hello World!");
    }

}
