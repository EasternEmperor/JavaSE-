package com.easterne.javase.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader：
 *      带有缓冲区的字符输入流
 *      使用这个流的时候不需要自定义char数组，自带缓冲
 *
 *      方法：String readline();       读取一行，但是会自动去除末尾的换行符'\n'
 */
public class BufferedReaderTest {

    public static void main(String[] args) {
        FileReader in = null;
        BufferedReader br = null;

        try {

            in = new FileReader("Copy02");
            /** 当一个流的构造方法的参数是另一个流的时候，这个被传进来的作为参数的流叫做：节点流
             * 外部负责包装的流叫做：包装流，也叫处理流
             * 关闭时，只要关闭包装流即可！关闭包装流相当于关闭了节点流！
             */
            // 在这里，in叫做节点流，br叫做包装流（处理流）
            br = new BufferedReader(in);

            // BufferedReader类可以直接读取一行
/*
            String s = br.readLine();
            System.out.println(s);
*/

            // 利用while循环
            String aLine = null;
            while ((aLine = br.readLine()) != null)
                // 从这里可以看出，readLine()会自动去除末尾的换行符'\n'
                System.out.println(aLine);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭时，只需要关闭包装流即可！
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
