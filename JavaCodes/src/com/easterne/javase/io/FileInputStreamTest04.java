package com.easterne.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 最终版，需要掌握！
 */
public class FileInputStreamTest04 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {

            fis = new FileInputStream("JavaCodes/one");

            byte[] bytes = new byte[10];

            // while循环1：
/*            while (true) {
                int readCnt = fis.read(bytes);
                if (readCnt == -1)
                    break;
                System.out.print(new String(bytes, 0, readCnt));
            }*/

            // while循环2：
            int readCnt = 0;
            while ((readCnt = fis.read(bytes)) != -1)
                System.out.print(new String(bytes, 0, readCnt));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
