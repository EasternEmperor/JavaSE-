package com.easterne.javase.exception;

/**
 * 为实现多种业务的异常，可编写自己的异常类
 *
 * 两步：
 *      1、编写一个类继承Exception或者RuntimeException
 *      2、提供两个构造方法：一个无参数的，一个有参数的
 */
public class MyException extends Exception {        // 编译时异常
    // 只需提供两个构造方法即可：有参和无参
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}

/*
public class MyException extends RuntimeException {     // 运行时异常

}*/
