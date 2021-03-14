package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * java.io.FileInputStream：
 *      1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
 *      2、字节的方式，完成输入的操作，完成读的操作（硬盘->内存）
 */
public class FileInputStreamTest {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // 创建文件字节输入流对象
            // 文件路径：IDEA会自动把\变成\\，因为java中\表转义
            //FileInputStream fis = new FileInputStream("E:\\STUDY\\IDEA Ultimate\\JavaSE\\one");
            // 把\\改成/也可以
            fis = new FileInputStream("E:/STUDY/IDEA Ultimate/JavaSE/one");

            // 开始读取
            int data = fis.read();
            System.out.println(data);   // 97

            data = fis.read();
            System.out.println(data);   // 98

            data = fis.read();
            System.out.println(data);   // 99

            data = fis.read();
            System.out.println(data);   // 100

            data = fis.read();
            System.out.println(data);   // 101

            data = fis.read();
            System.out.println(data);   // 102

            data = fis.read();
            System.out.println(data);   // 13，这里是换行符\n

            data = fis.read();
            System.out.println(data);   // 10，这里是换行符\n

            data = fis.read();
            System.out.println(data);   // 103

            // 文件中已经没有数据能读取了，则会返回-1
            data = fis.read();
            System.out.println(data);   // -1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {       // read()方法可能出现的异常！
            e.printStackTrace();
        } finally {
            // 注意流在finally中关闭
            // 注意关闭的前提是流（fis）不为空，避免空指针异常
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
