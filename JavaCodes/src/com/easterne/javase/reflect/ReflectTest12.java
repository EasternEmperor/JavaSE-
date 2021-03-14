package com.easterne.javase.reflect;

import com.easterne.javase.reflect.bean.Vip;

import java.lang.reflect.Constructor;

/**
 * 使用反射机制创建对象！
 */
public class ReflectTest12 {

    public static void main(String[] args) throws Exception {
        // 不使用反射机制如何构造对象？
        Vip v1 = new Vip();
        Vip v2 = new Vip("zhangsan", 110, "1990-1-1", false);

        // 怎么使用反射机制创建对象？
        // 获取类型
        Class vipClass = Class.forName("com.easterne.javase.reflect.bean.Vip");

        // 调用无参构造：newInstance()
        Object obj = vipClass.newInstance();
        System.out.println(obj);

        // 获取构造方法
        /**
         * 构造方法通过参数列表来区分！
         */
        Constructor c1 = vipClass.getDeclaredConstructor(String.class, int.class, String.class, boolean.class);
        Constructor c2 = vipClass.getDeclaredConstructor();

        // 参数个数和类型一定要匹配，否则报异常！
        Object obj2 = c1.newInstance("lisi", 111, "1992-1-1", false);
        Object obj3 = c2.newInstance();

        System.out.println(obj2);
        System.out.println(obj3);

    }

}
