package com.easterne.javase.exception;

/**
 * 测试MyException
 */
public class ExceptionTest12 {

    public static void main(String[] args) {
        MyException e = new MyException("用户名不存在！");

        // 打印异常的堆栈信息
        e.printStackTrace();

        // 获取异常的简单描述信息
        String s = e.getMessage();
        System.out.println(s);
    }

}
