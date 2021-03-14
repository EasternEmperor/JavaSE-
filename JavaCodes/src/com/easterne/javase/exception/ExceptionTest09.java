package com.easterne.javase.exception;

/**
 * finally：
 *      如果try中有System.exit(0)语句，则finally不会再执行
 */
public class ExceptionTest09 {

    public static void main(String[] args) {
        try {
            System.out.println("try...");
            System.exit(0);     // 退出虚拟机
        } finally {
            System.out.println("finally...");
        }
    }

}
