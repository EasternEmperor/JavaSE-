package com.easterne.javase.io;

import java.io.File;

/**
 * File类的listFiles()方法：
 *      File[] listFiles()，获取该目录下的所有文件！
 */
public class FileTest02 {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\EasternEmperor\\Pictures\\动漫图片");
        File[] files = file.listFiles();

        // for each遍历files
        for (File f : files)
            System.out.println(f.getName());
    }

}
