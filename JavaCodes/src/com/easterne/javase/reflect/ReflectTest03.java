package com.easterne.javase.reflect;

import com.easterne.javase.reflect.bean.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 验证反射机制的灵活性：
 *      java代码写一遍，在不改变java源代码的基础之上，可以做到不同类型
 *      的对象的实例化，非常之灵活（符合OCP开闭原则：对扩展开放，对修改封闭）
 */
public class ReflectTest03 {

    public static void main(String[] args) {

        // 用类名创建对象是比较死板的，只能创建相同类型的对象
        //User user = new User();

        // 以下代码是灵活的，代码不需要改动，只要改动配置文件，就可以创建不同的实例对象
        FileReader fr = null;
        try {

            // 通过IO流读取properties文件
            fr = new FileReader("JavaCodes/src/com/easterne/javase/reflect/classinfo.properties");
            // 创建属性类对象Map
            Properties pro = new Properties();  // key和value都是String
            // 加载
            pro.load(fr);

            // 通过pro对象，使用反射机制来实例化对象
            Set<Map.Entry<Object, Object>> set = pro.entrySet();
            for (Map.Entry<Object, Object> m : set) {
                Class c = Class.forName((String) m.getValue());
                Object obj = c.newInstance();
                System.out.println(obj);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
