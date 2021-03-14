package com.easterne.javase.reflect;

import com.easterne.javase.reflect.bean.User;

/**
 * 获取到Class的作用是什么？
 *      通过Class的newInstance()方法来实例化对象
 *      注意：newInstance()方法内部实际上调用了无参数构造方法，
 *          必须保证无参构造方法存在才行！
 */
public class ReflectTest02 {

    public static void main(String[] args) {

        // 不使用反射机制创建对象
        User user = new User();
        System.out.println(user);

        // 使用反射机制创建对象
        try {

            Class c = Class.forName("com.easterne.javase.reflect.bean.User");
            Object u = c.newInstance();
            System.out.println(u);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }

}
