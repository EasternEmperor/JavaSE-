package com.easterne.javase.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter：
 *      文件字符输出流：写
 *      只能输出普通文本
 */
public class FileWriterTest {

    public static void main(String[] args) {
        FileWriter out = null;
        try {

            // 创建字符输出流对象
            out = new FileWriter("two");
            // 如果不想覆盖文件内容，可将append参数置为true
            //out = new FileWriter("two", true);

            char[] chars = {'我', '是', '中', '国', '人'};

            // 开始写入字符
            out.write(chars);   // 直接将数组内容全部写入
            out.write(chars, 2, 3);     // offset:0, length:3，写入”中国人“三个字符

            // 写入换行符
            out.write("\n");
            // 换行后写入
            out.write("Hello World!");


            // 记得刷新！！！
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在这里关闭流
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
