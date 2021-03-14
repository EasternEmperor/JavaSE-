package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 反序列化集合
 */
public class ObjectInputStreamTest02 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        //Object obj = ois.readObject();
        //System.out.println(obj instanceof List);    // true

        List<Student> studentList = (List<Student>)ois.readObject();
        for (Student s : studentList) {
            System.out.println(s);
        }

        ois.close();
    }

}
