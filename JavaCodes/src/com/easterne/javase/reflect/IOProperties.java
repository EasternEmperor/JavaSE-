package com.easterne.javase.reflect;

import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 1、以后读取文件可以通过
 *      String path = Thread.currentThread().getContextClassLoader()
 *                      .getResource("文件在类的根路径下的路径").getPath();
 * 来获取绝对路径了！
 *
 * 2、甚至可以直接返回流：
 *      InputStream input = Thread.currentThread().getContextClassLoader()
 *  *                           .getResourceAsStream("文件在类的根路径下的路径");
 */
public class IOProperties {

    public static void main(String[] args) throws IOException {
        // 获取文件的绝对路径！
/*
        String path = Thread.currentThread().getContextClassLoader()
                        .getResource("com/easterne/javase/reflect/classinfo.properties").getPath();
        // 这里由于获取路径时，路径的某个目录有空格，会导致异常！无法找到路径(%20)
        // 所以注意文件路径的书写：一定不要有空格或中文字符
        FileReader reader = new FileReader(path);
*/

        /** 可以使用InputStream input = Thread.currentThread().getContextClassLoader()
         *                                 .getResourceAsStream("文件在类的根路径下的路径");
         * 直接获取流，这样即使路径有空格也不会出现异常！
         */
        InputStream reader = Thread.currentThread().getContextClassLoader()
                                .getResourceAsStream("com/easterne/javase/reflect/classinfo.properties");

        Properties pro = new Properties();
        // 读取
        pro.load(reader);
        Set<Map.Entry<Object, Object>> entrySet = pro.entrySet();
        for (Map.Entry<Object, Object> m : entrySet) {
            System.out.println(m.getValue());
        }
    }

}
