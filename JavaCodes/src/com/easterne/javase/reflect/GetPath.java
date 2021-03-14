package com.easterne.javase.reflect;

import java.io.FileReader;

/**
 * 研究一下文件路径的问题
 * 怎么获取一个文件的绝对路径？
 *      String path = Thread.currentThread().getContextClassLoader()
 *              .getResource("文件在类的根路径下的路径").getPath();
 *
 *      以上语句是通用的，但前提是：文件需要在类路径下，才能用这种方式
 *      （貌似无法通过该方法获取.java文件的绝对路径）
 */
public class GetPath {

    public static void main(String[] args) {
        // 一下读取文件的方式缺点：移植性差，在IDEA中默认的当前路径是project的根
        // 这个代码一旦离开了IDEA，换到其他位置，可能当前路径不是project的根了，这时这个路径就无效了
        //FileReader fr = new FileReader("JavaCodes/src/com/easterne/javase/reflect/classinfo.properties");

        // 下面这种通用方式获取路径，即使代码换位置甚至换操作系统了，都可以使用
        // 注意：前提是这个文件在类路径下！
        // 类路径即：src下的文件都是类路径下的文件！
        // src是类的根路径
        /**
         * 代码解释：
         *      Thread.currentThread()      当前线程对象
         *      getContextClassLoader()     线程对象用来获取当前线程的类加载器对象的方法
         *      getResource()               【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
         */
        String path = Thread.currentThread().getContextClassLoader()
                        .getResource("com/easterne/javase/reflect/classinfo.properties").getPath();

        // 采用以上代码可以拿到一个文件的绝对路径
        // /E:/STUDY/IDEA%20Ultimate/JavaSE/out/production/JavaCodes/com/easterne/javase/reflect/classinfo.properties
        System.out.println(path);

        // 获取User.java的绝对路径
        String path2 = Thread.currentThread().getContextClassLoader()
                        .getResource("com/easterne/javase/io/one").getPath();
        // /E:/STUDY/IDEA%20Ultimate/JavaSE/out/production/JavaCodes/com/easterne/javase/io/one
        System.out.println(path2);


    }

}
