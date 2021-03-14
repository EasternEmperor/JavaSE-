package com.easterne.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关于try...catch中的finally子句：
 *      1、在finally子句中的代码是最后执行的，并且是一定会执行的，即使try语句块中的代码出现了异常
 *         finally子句必须和try一起出现，不能单独写
 *
 *      2、finally语句通常使用在哪些情况下呢？
 *          通常在finally语句块中完成资源的释放/关闭
 *          因为finally中的代码比较有保障
 *          即使try语句块中的代码出现异常，finally中的代码也会正常执行
 */
public class ExceptionTest07 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 打开文件
            fis = new FileInputStream("D:\\tencent\\副本.7z");

            // 进行读文件操作

            // 此处出现空指针异常
            String s = null;
            s.toString();

            // 完成文件操作后一定要关闭文件，否则浪费资源
            // 此处代码可以放到finally中，避免上面出现异常后，try在异常后面的语句不执行！
            //fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {  // 空指针异常属于运行时异常，可以处理，也可以不处理
            e.printStackTrace();
        } finally {
            // 这里先判断fis是否成功打开了文件，再进行关闭，否则会出现空指针异常
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
