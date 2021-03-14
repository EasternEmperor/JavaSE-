package com.easterne.javase.exception;

/**
 * finally中的代码一定会执行！
 */
public class ExceptionTest08 {

    public static void main(String[] args) {
        /**
         * try语句不能单独使用，或者联合catch、或者联合finally
         *
         * 以下代码的执行顺序：
         *      先执行输出：try...
         *      再执行输出：finally...
         *      最后执行：return;
         */
        try {
            System.out.println("try...");
            return;     // return之后，方法结束
        } finally {
            System.out.println("finally...");
        }
    }

}
