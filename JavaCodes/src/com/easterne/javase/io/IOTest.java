package com.easterne.javase.io;

/**
 * 1、流按照方向可分为：输入流和输出流
 *   流按照读取数据的方式可分为：字节流和字符流
 *
 * 2、java中所有流都在java.io.*下
 *
 * 3、java IO流有四大家族（以下四个类都是抽象类）：
 *      java.io.InputStream     字节输入流
 *      java.io.OutputStream    字节输出流
 *
 *      java.io.Reader          字符输入流
 *      java.io.Writer          字符输出流
 *
 *      注意：在java中，只要类名以"Stream"结尾的都是字节流
 *           以"Reader"或"Writer"结尾的都是字符流
 *
 * 4、所有的流都实现了java.io.Closable接口，都是可关闭的，有close()方法。
 *    流是内存和硬盘之间的通道，用完之后一定要关闭！
 *
 * 5、所有的输出流都实现了java.io.Flushable接口，都是可刷新的，有flush()方法
 *    要养成一个好习惯：输出流在最终输出后，一定记得要flush()刷新一下（清空管道）。
 *    刷新的作用：清空管道！
 *    注意：如果没有flush()可能会丢失数据！
 *
 * 6、java.io下的包需要掌握的流有16个：
 *      文件专属：
 *          java.io.FileInputStream
 *          java.io.FileOutputStream
 *          java.io.FileReader
 *          java.io.FileWriter
 *
 *      转换流（将字节流转换为字符流）：
 *          java.io.InputStreamReader
 *          java.io.OutputStreamWriter
 *
 *      缓冲流专属：
 *          java.io.BufferedReader
 *          java.io.BufferedWriter
 *          java.io.BufferedInputStream
 *          java.io.BufferedOutputStream
 *
 *      数据流专属：
 *          java.io.DataInputStream
 *          java.io.DataOutputStream
 *
 *      标准输出流：
 *          java.io.PrintWriter
 *          java.io.PrintStream
 *
 *      对象专属流：
 *          java.io.ObjectInputStream
 *          java.io.ObjectOutputStream
 */
public class IOTest {
}
