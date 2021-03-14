package com.easterne.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 深入try...catch
 *      1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类
 *      2、catch可以写多个。建议写catch的时候，精确地一个一个处理，这样有利于程序的调试
 *      3、catch写多个的时候，从上到下，必须遵守从子到父（从小到大）
 */
public class ExceptionTest04 {

/*  throws可以多个
    public static void main(String[] args) throws Exception, FileNotFoundException {

    }*/

/*  也可以只有一个
    public static void main(String[] args) throws Exception {

    }*/

    public static void main(String[] args) {

        // 编译报错，没有处理FileNotFoundException
        /*try {
            FileInputStream fis = new FileInputStream("D:\\tencent\\【2021寒假宣讲面试时间地点安排】.xlsx");
        } catch (NullPointerException e) {

        }*/

        // catch中要传入对应的异常对象，或者利用多态传入对应异常类的父类对象
/*
        try {
            FileInputStream fis = new FileInputStream("D:\\tencent\\【2022寒假宣讲面试时间地点安排】.xlsx");
            System.out.println("以上出现异常，此处无法执行！");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
        System.out.println("hello world");
*/

        // catch中写应处理的异常类的父类
/*
        try {
            FileInputStream fis = new FileInputStream("D:\\tencent\\【2022寒假宣讲面试时间地点安排】.xlsx");
            System.out.println("以上出现异常，此处无法执行！");
        } catch (IOException e) {   // 多态：IOException e = new FileNotFoundException();
            System.out.println("文件不存在！");
        }
*/
/*
        try {
            FileInputStream fis = new FileInputStream("D:\\tencent\\【2022寒假宣讲面试时间地点安排】.xlsx");
            System.out.println("以上出现异常，此处无法执行！");
        } catch (Exception e) {   // 多态：Exception e = new FileNotFoundException();
            System.out.println("文件不存在！");
        }
*/

        // 多个catch，精确处理
/*
        try {
            FileInputStream fis = new FileInputStream("D:\\tencent\\【2022寒假宣讲面试时间地点安排】.xlsx");
            fis.read();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println("读文件出错！");
        }
*/

        // 编译报错：捕捉的异常应当从小到大
/*
        try {
            FileInputStream fis = new FileInputStream("D:\\tencent\\【2022寒假宣讲面试时间地点安排】.xlsx");
            fis.read();
        } catch (IOException e) {
            System.out.println("文件不存在！");
        } catch (FileNotFoundException e) {
            System.out.println("读文件出错！");
        }
*/

        // JDK8 新特性
        try {
            FileInputStream fis = new FileInputStream("D:\\tencent\\【2022寒假宣讲面试时间地点安排】.xlsx");

            System.out.println(100 / 0);

        } catch (FileNotFoundException | ArithmeticException e) {   // 使用 | 来捕捉多种类型的异常
            System.out.println("文件不存在或算数出错！");
        }


    }

}
