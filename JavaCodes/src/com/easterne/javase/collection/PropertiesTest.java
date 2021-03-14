package com.easterne.javase.collection;

import java.util.Properties;

/**
 * Properties是一个Map集合，继承Hashtable，Properties的key和value都是String类型
 * Properties被称为属性类对象
 * Properties是线程安全的
 */
public class PropertiesTest {

    public static void main(String[] args) {
        // 创建Properties对象
        Properties p = new Properties();

        // 掌握两个方法：存setProperties()、取getProperties()

        // 存setProperties()
        p.setProperty("url", "www://baidu.com");
        p.setProperty("driver", "com.mysql.jdbc.driver");
        p.setProperty("username", "administrator");
        p.setProperty("password", "123");

        // 取getProperties()
        String s1 = p.getProperty("url");
        String s2 = p.getProperty("driver");
        String s3 = p.getProperty("username");
        String s4 = p.getProperty("password");
        String s5 = p.getProperty("pass");      // null

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

}
