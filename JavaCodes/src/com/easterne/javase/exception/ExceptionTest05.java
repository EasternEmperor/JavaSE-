package com.easterne.javase.exception;

/**
 * 异常对象有两个非常重要的方法：
 *
 *      获取异常的简单的描述信息：
 *          String msg = exception.getMessage();
 *
 *      打印异常追踪的堆栈信息：
 *          exception.printStackTrace();
 */
public class ExceptionTest05 {

    public static void main(String[] args) {

        // 这里new异常对象，但是没有将其抛出（throw），JVM会将其当作普通的java对象
        NullPointerException e = new NullPointerException("空指针异常！");
        // getMessage()获取异常的简单的描述信息：即上面构造方法中传入的String参数
        String msg = e.getMessage();
        System.out.println(msg);

        // 打印异常的堆栈信息：后台是以异步线程的方式打印的
        e.printStackTrace();

        System.out.println("Hello World");
    }

}
