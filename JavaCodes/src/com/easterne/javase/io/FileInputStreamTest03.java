package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * int read(byte[] b)：
 *      一次最多读取b.length个字节。
 *      减少硬盘和内存的交互，提高程序效率
 *      往byte[]数组里读
 *
 * 以及String类的构造方法：
 *       String(bytes)
 *       String(bytes, offset, length)
 */
public class FileInputStreamTest03 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {

            // 什么是相对路径？相对路径一定是以当前所在位置作为起点开始查找的！
            /**
             * IDEA中默认的当前路径是：
             *      工程Project的根就是IDEA默认的当前路径！
             */
            fis = new FileInputStream("one");   // 即工程根目录下的one文件！

            // 在当前包内的文件，注意第一个前面不用带'/'和'\\'！
            fis = new FileInputStream("JavaCodes/src/com/easterne/javase/io/one");

            // 创建大小为4的byte数组，用来存储读取的字节
            byte[] bytes = new byte[4];

            int readCnt = fis.read(bytes);
            System.out.println("第一次读取到：" + readCnt + "个字符");    // 4
            // 转换为String类型，使用Stirng的构造方法
            // 第一种方法：String(bytes)，会将byte数组里的所有字节转换为字符
            System.out.println(new String(bytes));      // abcd
            // 第二种方法：String(bytes, offset, length)，可以指定起点和长度
            System.out.println(new String(bytes, 0, readCnt));  // abcd

            // 从以下可得：一个\n字符（即换行符）占用两个字节！
            readCnt = fis.read(bytes);
            System.out.println("第二次读取到：" + readCnt + "个字符");    // 4
            System.out.println(new String(bytes));      // ef\ng
            System.out.println(new String(bytes, 0, readCnt));  // ef\ng

            readCnt = fis.read(bytes);
            System.out.println("第三次读取到：" + readCnt + "个字符");    // 1
            System.out.println(new String(bytes));      // ef\ng
            System.out.println(new String(bytes, 0, readCnt));  // ef\ng

            // 在读取到文件末尾后，再也读不到字符时，返回-1
            readCnt = fis.read(bytes);
            System.out.println("第四次读取到：" + readCnt + "个字符");    // -1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
