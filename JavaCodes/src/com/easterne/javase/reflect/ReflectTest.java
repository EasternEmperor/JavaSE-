package com.easterne.javase.reflect;

import java.util.Date;

/**
 * 反射机制(reflect)：
 *      1、反射机制的作用：
 *          通过java语言中的反射机制可以操作字节码文件，可以读和修改字节码文件，
 *          操作代码片段（class文件）
 *
 *      2、反射机制的相关类在哪个包下？
 *          java.lang.reflect.*
 *
 *      3、反射机制相关的重要的类有哪些？
 *          java.lang.Class：代表整个字节码，代表一个类型
 *          java.lang.reflect.Method：代表字节码中的方法字节码
 *          java.lang.reflect.Constructor：代表字节码中的构造方法字节码
 *          java.lang.reflect.Field：代表字节码中的属性字节码，代表类中的成员变量
 *
 *          java.lang.Class：
 *          public class User {
 *              // Field
 *              int no;
 *
 *              // Constructor
 *              public User() {}
 *              public User(int no) {
 *                  this.no = no;
 *              }
 *
 *              // Method
 *              public void doSome() {
 *
 *              }
 *          }
 *
 * 要操作一个类的字节码，首先需要获取到这个类的字节码文件，有三种方法：
 *      1、Class c = Class.forName("完整类名带包名");
 *
 *      2、Class c = 对象.getClass();
 *
 *      3、java语言中任何一种类型，包括基本数据类型，都有.Class属性
 *      可用：Class c = 任何类型.class;
 *        如：Class c1 = String.class;
 *           Class c2 = int.class;
 */
public class ReflectTest {

    public static void main(String[] args) {
        /**
         * Class.forName(String )：
         *      1、静态方法
         *      2、方法的参数是一个字符串
         *      3、字符串需要的是一个完整类名
         *      4、完整类名必须带有包名，如：java.lang.String
         */
        Class c1 = null, c2 = null;
        try {
            // c1代表String.class文件，或者说代表String类型的字节码文件
            c1 = Class.forName("java.lang.String");
            // c2、c3、c4同理
            c2 = Class.forName("java.util.Date");
            Class c3 = Class.forName("java.lang.Integer");
            Class c4 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /**
         * 所有对象都有的方法：getClass()：
         *      获得该对象对应的类型的字节码文件
         */
        String x = "abc";
        Class cx = x.getClass();
        System.out.println(cx == c1);   // true

        Date date = new Date();
        Class cd = date.getClass();
        System.out.println(cd == c2);   // true

        /**
         * java中任何类型都有.class属性，包括基本数据类型
         *      任何类型.class
         */
        Class cs = String.class;
        Class ci = int.class;
        Class cb = boolean.class;
        System.out.println(cs == c1);   // true
    }

}
