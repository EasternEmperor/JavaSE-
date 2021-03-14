package com.easterne.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileReader和FileWriter进行拷贝：
 *      只能拷贝普通文本文件！
 */
public class Copy02 {

    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {

            // 输入流
            in = new FileReader("JavaCodes/src/com/easterne/javase/io/Copy02.java");
            // 输出流
            out = new FileWriter("Copy02");

            // 拷贝！
            char[] chars = new char[1024 * 512];    // 1MB字符！
            int readCnt = 0;
            while ((readCnt = in.read(chars)) != -1)
                out.write(chars, 0, readCnt);

            // 输出完成记得flush()
            out.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally从句中关闭流
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
