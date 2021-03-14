package com.easterne.javase.exception;

/**
 * 以下代码报错原因：
 *      因为doSome()方法在方法位置上使用了：throws ClassNotFoundException
 *      且ClassNotFoundException是编译时异常，必须编写代码进行预处理。
 */
public class ExceptionTest02 {

    public static void main(String[] args) throws ClassNotFoundException {
        // main()方法中调用doSome()
        // 因为doSome()方法在方法位置上使用了：throws ClassNotFoundException
        // 而且ClassNotFoundException属于编译时异常，需要在程序编写时进行处理
        // 所以我们在调用doSome()方法时，必须对这种异常进行预处理
        // 否则编译器报错：
        // 未报告的异常错误java.lang.ClassNotFoundException; 必须对其进行捕获或声明以便抛出
//        doSome();
    }

    /**
     * doSome()方法在方法位置上使用了：throws ClassNotFoundException
     * 表示该方法在执行时可能会出现ClassNotFoundException
     * 而且ClassNotFoundException属于编译时异常，需要在程序编写时进行处理
     * 不处理的话，编译器会报错
     * （如果throws运行时异常则不用在调用方法时进行处理）
     * @throws ClassNotFoundException
     */
    public static void doSome() throws ClassNotFoundException {
        System.out.println("Do Some!");
    }
}
