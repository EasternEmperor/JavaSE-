package com.easterne.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用PrintStream编写日志工具
 *
 * 注意：PrintStream流不用关闭，也不用刷新，会自动关闭
 */
public class PrintStreamTest {

    public static void main(String[] args) {
        Logger.log("启动了程序");
        Logger.log("调用了Logger，加载日志");
        Logger.log("Goodbye!");
    }

}

class Logger {
    public static void log(String msg) {
        try {

            // 指向一个日志文件
            PrintStream out = new PrintStream(new FileOutputStream("log.txt", true));
            // 改变标准输出流的输出方向
            System.setOut(out);

            // 得到当前时间
            Date nowTime = new Date();
            // 格式化时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            // 此时标准输出流的目的地为：log.txt，而不是控制台！
            System.out.println(strTime + "：" + msg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 该流不用关闭，也不用刷新

    }
}
