package com.easterne.javase.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java.io.DataOutputStream：数据专属的流
 * 这个流可以将数据连同数据的类型一并写入文件
 * 注意：这个文件不是普通文本文档（用记事本打不开！）
 */
public class DataOutputStreamTest {

    public static void main(String[] args) throws IOException {
        // 创建数据专属的字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("four"));
        // 写数据
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 0.1F;
        double d = 3.14;
        boolean sex = false;
        char c = 'c';
        String str = "我是中国人";

        // 写数据
        // DataOutputStream会将数据以及数据的类型一并写入到文件中
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);
        dos.writeUTF(str);

        // 刷新流
        dos.flush();
        // 关闭流
        dos.close();
    }

}
