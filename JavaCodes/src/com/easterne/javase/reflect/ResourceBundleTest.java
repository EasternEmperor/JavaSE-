package com.easterne.javase.reflect;

import java.util.ResourceBundle;
import java.util.Set;

/**
 * 更简单的读取配置文件.properties的方式：
 *      ResourceBundle bundle = ResourceBundle.getBundle("当前类路径下的路径");
 */
public class ResourceBundleTest {

    public static void main(String[] args) {
        // 资源绑定器，只能绑定.properties文件。并且这个文件必须在类路径下
        // 在写路径时，扩展名.properties不用写！
        ResourceBundle bundle = ResourceBundle.getBundle("com/easterne/javase/reflect/classinfo");

        // 获取value
        Set<String> keys = bundle.keySet();
        for (String key : keys) {
            String className = bundle.getString(key);
            try {
                Class c = Class.forName(className);
                Object obj = c.newInstance();
                System.out.println(obj);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

        }
    }

}
