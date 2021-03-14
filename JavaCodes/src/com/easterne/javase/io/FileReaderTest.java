package com.easterne.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader：
 *      文件字符输入流，只能读取普通文本
 *      读取文本内容时，比较方便快捷！
 */
public class FileReaderTest {

    public static void main(String[] args) {
        FileReader fr = null;
        try {

            // 创建文件字符输入流
            fr = new FileReader("one");
            // 以字符形式读！
            char[] chars = new char[4];     // 一次读取4个字符

            // 往char数组中读取
            fr.read(chars);
            for (char c : chars)    // a b c d
                System.out.print(c + " ");

/*            // 开始读
            int readCnt = 0;
            while ((readCnt = fr.read(chars)) != -1)
                System.out.print(new String(chars, 0, readCnt));
            */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
