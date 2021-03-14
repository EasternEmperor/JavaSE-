package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 学习两个方法：
 *      int available();        返回文件中剩余没读的字节数
 *      long skip(long n);      将输入流的n个字节跳过并抛弃
 */
public class FileInputStreamTest05 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {

            fis = new FileInputStream("one");
            System.out.println("该文件的总字节数量：" + fis.available());     // 9
/*            // 读一个字节
            int readByte = fis.read();
            // 剩余字节数
            System.out.println("剩余未读取的字节数：" + fis.available());     // 8
*/
            // available()方法的作用？
/*

            byte[] bytes = new byte[fis.available()];
            // 不需要循环，读取一次就够了
            // 这种方法不适合太大的文件，因为byte[]数组不能太大！
            int readCnt = fis.read(bytes);
            System.out.println(new String(bytes, 0, readCnt));
*/

            // skip(long n)的用法
            fis.skip(3);    // 跳过3个字节
            System.out.println(fis.available());    // 6
            System.out.println(fis.read());         // 100

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
