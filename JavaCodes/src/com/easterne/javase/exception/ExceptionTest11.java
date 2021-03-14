package com.easterne.javase.exception;

/**
 * final、finally、finalize的区别
 *      final：关键字
 *          - final修饰的类无法继承
 *          - final修饰的方法无法覆盖
 *          - final修饰的变量不能重新赋值
 *
 *      finally：关键字
 *          和try联合使用
 *          finally中的代码块是必须执行的
 *
 *      finalize：标识符
 *          是一个Object类中的方法名
 *          垃圾回收器GC负责调用它
 */
public class ExceptionTest11 {

    public static void main(String[] args) {
        // final是一个关键字。修饰不可变变量
        final int i = 100;
        //i = 200;      值不能更改

        // finally也是一个关键字，和try联合使用，在异常处理机制中
        // finally中的代码是一定会执行的
        try {

        } finally {
            System.out.println("finally..");
        }

        // finalize是Object中的一个方法
        // 所以finalize是标识符，垃圾回收器GC负责调用它
        Object obj;

    }

}

// final修饰的类无法继承
final class A {
    // 常量
    public static final double PI = 3.14;
}

class B {
    // final修饰的方法无法覆盖
    public final void m() {

    }
}
