package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * while循环，利用FileInputStream类读取文件
 *
 * 该方法的缺点：
 *      一次只能读取一个byte，效率太低！
 */
public class FileInputStreamTest02 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:/STUDY/IDEA Ultimate/JavaSE/one");

            // 读取文件
            // 第一种：
/*            while (true) {
                int data = fis.read();
                // 读取到文件末尾则退出循环
                if (data == -1)
                    break;
                System.out.println(data);
            }*/

            // 第二种精炼的方法：
            int data = 0;
            while ((data = fis.read()) != -1)
                System.out.println(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {   // 为read()方法添加的异常
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
