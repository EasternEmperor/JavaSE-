package com.easterne.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件字节输出流，负责写：
 *      从内存到硬盘
 */
public class FileOutputStreamTest {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {

            // 打开文件进行写，如果文件不存在则会自动创建
            // 以下构造方法写入，会先清空原文件中的内容再写
            //fos = new FileOutputStream("JavaCodes/src/com/easterne/javase/io/two");

            // 用下面的构造方法，可实现在文件末尾追加写入的方式，不清空原文件内容
            fos = new FileOutputStream("JavaCodes/src/com/easterne/javase/io/two", true);

            // 开始写
            byte[] bytes = {97, 98, 99, 100};       // abcd

            // 写入换行符
            String s = "\n";
            fos.write(s.getBytes());

            // 将bytes中的内容全部写入
            fos.write(bytes);       // abcd
            // 将bytes中的一部分内容写入
            fos.write(bytes, 0, 2); // ab


            // 写完之后，一定要记得调用flush()方法进行刷新！
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
