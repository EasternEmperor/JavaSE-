package com.easterne.javase.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * DataInputStream：数据字节输入流
 * DataOutputStream写的文件，只能使用DataInputStream去读取。并且读取时你需要知道
 * 要读取数据的类型！
 * 读的顺序要和写的顺序一致，才能正常取出数据
 */
public class DataInputStreamTest {

    public static void main(String[] args) {
        DataInputStream dis = null;

        try {

            // 创建数据字节输入流
            dis = new DataInputStream(new FileInputStream("four"));

            // 开始读
            byte b = dis.readByte();
            short s = dis.readShort();
            int i = dis.readInt();
            long l = dis.readLong();
            float f = dis.readFloat();
            double d = dis.readDouble();
            boolean sex = dis.readBoolean();
            char c = dis.readChar();
            String str = dis.readUTF();

            // 输出读取的数据
            System.out.println(b);
            System.out.println(s);
            System.out.println(i);
            System.out.println(l);
            System.out.println(f);
            System.out.println(d);
            System.out.println(sex);
            System.out.println(c);
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis != null) {
                // 关闭流
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
