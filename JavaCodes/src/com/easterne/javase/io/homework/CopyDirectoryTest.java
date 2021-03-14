package com.easterne.javase.io.homework;

import java.io.*;

/**
 * 作业：拷贝目录
 *      源目录：C:\Users\EasternEmperor\Documents\平台运营部
 *      目标目录：C:\Users\EasternEmperor\Desktop
 *
 * 可能要使用：
 *      FileInputStream
 *      FileOutputStream
 *      File
 */
public class CopyDirectoryTest {

    public static void main(String[] args) {
        String srcPath = "C:\\Users\\EasternEmperor\\Documents\\平台运营部";
        String desPath = "C:\\Users\\EasternEmperor\\Desktop";

        CopyDirectory.copy(srcPath, desPath);

    }

}

class CopyDirectory {
    /**
     * 复制文件的主方法，递归调用可复制目录
     * @param srcPath：源目录
     * @param desPath：目的目录
     */
    public static void copy(String srcPath, String desPath) {
        // 创建File对象
        File srcFile = new File(srcPath);
        File desFile = new File(desPath + '\\' + srcFile.getName());
        desFile.mkdir();        // 先复制该目录
        // 获取源目录下的文件
        File[] files = srcFile.listFiles();

        for (File f : files) {
            // 如果是目录的话则再调用一下该方法，复制目录
            if (f.isDirectory())
                copy(srcPath + '\\' + f.getName(), desFile.getAbsolutePath());
            // 如果是文件，则调用复制文件的方法
            if (f.isFile())
                copyDoc(srcPath + '\\' + f.getName(), desFile.getAbsolutePath() + '\\' + f.getName());
        }
    }

    /**
     * 复制文档的方法，被copy()调用
     * @param srcPath：源目录
     * @param desPath：目的目录
     */
    private static void copyDoc(String srcPath, String desPath) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 打开输入和输出文件
            fis = new FileInputStream(srcPath);
            fos = new FileOutputStream(desPath);

            // byte数组，一次复制1MB
            byte[] bytes = new byte[1024 * 1024];

            // 开始读
            int readCnt = 0;
            while ((readCnt = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, readCnt);
            }

            // 输出结束要刷新输入流！
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {     // 在这里关闭流
            // 关闭输入流
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 关闭输出流
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
