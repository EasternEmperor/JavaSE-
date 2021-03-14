package com.easterne.javase.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.io.File类：
 *      继承Object类，无法读写文件！
 *
 * File类的常用方法：
 *      1、File(String pathname)
 *          构造方法，传入路径
 *
 *      2、boolean exists()
 *          判断该路径的文件或者路径是否存在
 *
 *      3、boolean mkdir()
 *          该路径不存在时，将该路径（单目录）创建出来
 *
 *      4、boolean mkdirs()
 *          该路径不存在时，将该路径（多重目录）创建出来
 *
 *      5、boolean createNewFile()
 *          该文件不存在时，将该文件创建出来
 *
 *      6、String getParent()
 *          获取父目录的绝对路径
 *
 *      7、File getParentFile()
 *          获取父目录，返回文件类
 *
 *      8、String getAbsolutePath()
 *          获取绝对路径
 *
 *      9、String getName()
 *          获取文件或路径的名字
 *
 *      10、boolean isDirectory()
 *          判断是否是路径
 *
 *      11、boolean isFile()
 *          判断是否是文件
 *
 *      12、long lastModified()
 *          获取文件最后一次修改时间（注意：返回值为long）
 *          返回的是从1970.1.1到修改时的总毫秒数！
 *
 *      13、long length()
 *          获取文件大小（单位为bytes）
 *          注意：经测试，该方法返回目录大小时，不准确。只能用来获取非目录的文件大小
 */
public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("D:/myFile");

        // 判断文件是否存在
        System.out.println(file.exists());      // false

        // 如果不存在则以文件的形式创建
/*        if (! file.exists())
            file.createNewFile();*/

        // 如果不存在则以目录的形式创建
/*        if (! file.exists())
            file.mkdir();*/

        // 多目录的创建
/*        File file1 = new File("D:/a/b/c");
        if (! file1.exists())
            file1.mkdirs();*/


        File file2 = new File("D:\\tencent\\我爱学习");

        // 获取文件的父路径（以String类返回）
        String parentPath = file2.getParent();
        System.out.println(parentPath);     // D:\tencent

        // 获取文件的父路径（以File类返回）
        File parentFile = file2.getParentFile();
        System.out.println(parentFile.getAbsolutePath());   // D:\tencent

        File file3 = new File("one");
        System.out.println(file3.getAbsolutePath());    // E:\STUDY\IDEA Ultimate\JavaSE\one


        File file4 = new File("D:\\tencent");

        // 获取文件或目录的名字
        System.out.println("file4的名字：" + file4.getName());  // tencent

        // 判断是否是目录
        System.out.println("Directory? " + file4.isDirectory()); // true
        // 判断是否是文件
        System.out.println("File? " + file4.isFile());       // false

        // 返回文件最后一次修改的时间
        long ms = file4.lastModified();
        // 这里是Date类的构造方法，传入毫秒数，自动转换成Date对象
        // 也是从1970.1.1算起！
        Date date = new Date(ms);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime1 = sdf.format(date);
        System.out.println("该文件上一次修改时间为：" + strTime1);

        // 获取文件大小
        file4 = new File("C:\\Users\\EasternEmperor\\Pictures\\动漫图片\\shy.jpg");
        System.out.println("该文件大小为：" + file4.length() + "bytes");

    }

}
