package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileInputStream + FileOutputStream完成文件的拷贝
 * 拷贝的过程是一边读、一边写
 * 使用以上的字节流拷贝文件时，文件类型随意，是万能的，什么样的文件都可以拷贝
 */
public class Copy {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {

            // 打开输入文件
            fis = new FileInputStream("C:\\Users\\EasternEmperor\\Videos\\平台运营部\\平台运营部招新.mp4");
            // 打开输出文件（不存在则会自动创建）
            fos = new FileOutputStream("C:\\Users\\EasternEmperor\\Desktop\\Copy.mp4");

            // byte数组
            byte[] bytes = new byte[1024 * 1024];   // 一次拷贝1MB

            // 一边读，一边写
            int readCnt = 0;
            while ((readCnt = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, readCnt);
            }

            // 注意输入结束后一定要调用flush()方法，刷新输出流
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            // 这里fos和fis的close()方法，异常分开抓取
            // 如果一起抓取的话，有可能导致出现异常后，另一个流没有关闭！
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
