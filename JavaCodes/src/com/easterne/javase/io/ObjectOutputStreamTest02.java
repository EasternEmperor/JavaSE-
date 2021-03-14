package com.easterne.javase.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 一次序列化多个对象：
 *      将对象放在一个集合当中，序列化集合
 *
 * 提示：
 *      参与序列化的ArrayList集合以及集合中的元素User都需要实现java.io.Serializable接口
 */
public class ObjectOutputStreamTest02 {

    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(110, "zhangsan"));
        studentList.add(new Student(111, "lisi"));
        studentList.add(new Student(112, "wangwu"));

        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        // 序列化一个集合对象，这个集合里放了很多其他对象
        oos.writeObject(studentList);

        oos.flush();
        oos.close();
    }

}
