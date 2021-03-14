package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化：
 *      将对象读取出来
 */
public class ObjectInputStreamTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建ObjectInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));

        // 反序列化，即读取
        Object obj = ois.readObject();
        // 输出
        System.out.println(obj);
        ois.close();
    }

}
