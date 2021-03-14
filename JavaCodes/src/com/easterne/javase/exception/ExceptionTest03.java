package com.easterne.javase.exception;

/**
 * 注意：
 *      只要异常没有被捕捉，采用上报的方式，此方法的后续代码不会执行
 *      另外需要注意，try语句块中的某一行出现异常，该行后续代码不执行
 *      try...catch捕捉异常后，catch后续代码可以执行
 *
 * 在以后的开发中，处理编译时异常，应该上报还是捕捉？
 *      如果希望调用者来处理，选择throws上报。
 */
public class ExceptionTest03 {

    // 第一种处理方式：在方法声明的位置继续使用throws，完成异常的上抛。
    // 这里是main方法，上抛给JVM
    /*public static void main(String[] args) throws ClassNotFoundException {
        doSome();
    }*/

    // 第二种处理方式：使用try...catch进行捕捉
    // 使用try...catch是解决了异常
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("Do Some!");
    }
}
