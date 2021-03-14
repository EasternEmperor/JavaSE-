package com.easterne.javase.io;

import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * IO+Properties的联合使用
 */
public class IOPropertiesTest {

    public static void main(String[] args) throws IOException {
        /**
         * Properties是一个Map集合，key和value都是String类型
         * 将userInfo.properties文件中的数据加载到Properties对象中
         */
        // 新建输入流对象
        FileReader fr = new FileReader("JavaCodes/src/com/easterne/javase/io/userInfo.properties");

        // 创建Properties集合
        Properties pro = new Properties();

        // 调用properties对象的load方法将文件中的数据顺着管道加载
        pro.load(fr);

        // 通过key来获取value
        Set<Object> set = pro.keySet();
        // for each循环
        for (Object o : set) {
            System.out.println(pro.getProperty((String) o));
        }

        // 第二种方法：entrySet()
        Set<Map.Entry<Object, Object>> stringSet = pro.entrySet();
        for (Map.Entry<Object, Object> m : stringSet) {
            System.out.println(m.getKey() + "=" + m.getValue());
        }


    }

}
