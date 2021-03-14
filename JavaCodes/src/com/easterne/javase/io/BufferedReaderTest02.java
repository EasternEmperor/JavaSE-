package com.easterne.javase.io;

import java.io.*;

/**
 * 转换流：InputStreamReader    将字节流转换为字符流
 */
public class BufferedReaderTest02 {

    public static void main(String[] args) {

        FileInputStream in = null;
        InputStreamReader reader = null;
        BufferedReader br = null;

        // 字节流
        try {
/*
            // 字节流
            in = new FileInputStream("Copy02");

            // 通过转换流转换（InputStreamReader将字节流转换为字符流）
            // in是节点流，reader是包装流
            reader = new InputStreamReader(in);

            // BufferedReader的构造函数只能传入字符流，不能传字节流
            // 这里，reader是节点流，br是包装流
            br = new BufferedReader(reader);
            */

            // 可以把以上代码合并！
            br = new BufferedReader(new InputStreamReader(new FileInputStream("Copy02")));

            // 读取
            String line = null;
            while ((line = br.readLine()) != null)
                System.out.println(line);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 只要关闭最外面的包装流即可
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
