package com.easterne.javase.io;

import java.io.*;

/**
 * BufferedWriter：带有缓冲区的字符输出流
 * OutputStreamWriter：转换流
 */
public class BufferedWriterTest {

    public static void main(String[] args) throws Exception {

        // 带有缓冲区的字符输出流
        //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Three")));
        // 以追加的形式在文件末尾写
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Three", true)));

        // 开始写
        out.write("Hello World!");
        out.write("\n");
        out.write("Goodbye World!");

        // 一定记得刷新！
        out.flush();

        // 最后关闭！
        out.close();
    }

}
