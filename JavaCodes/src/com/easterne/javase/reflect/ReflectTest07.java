package com.easterne.javase.reflect;

import com.easterne.javase.reflect.bean.Student;

import java.lang.reflect.Field;

/**
 * 掌握：
 *      如何通过反射机制访问一个java对象的属性？
 *          给属性赋值set
 *          获取属性的值get
 *
 *      反射机制使代码变复杂了，但是也变得灵活了！
 *
 *      访问非public修饰的属性：setAccessible()，置为true，
 *      虽然会打破封装，但是也没办法
 */
public class ReflectTest07 {

    public static void main(String[] args) throws Exception {

        // 不使用反射机制，如何访问属性？
        Student s = new Student();

        // 给属性赋值
        /**
         * 三要素：对象s、属性no、值1111
         */
        s.no = 1111;
        // 获取属性的值
        System.out.println(s.no);


        // 使用反射机制，如何访问属性？
        Class studentClass = Class.forName("com.easterne.javase.reflect.bean.Student");
        // 创建对象（注意：newInstance()调用的是无参构造
        Object obj = studentClass.newInstance();

        // 给no属性赋值
        // 先获取no属性（根据属性的名称来获取Field）
        Field noField = studentClass.getField("no");
        /**
         * 虽然使用了反射机制，但三要素还是缺一不可：
         *      obj对象、no属性、2222值
         *      即：对象、属性、值
         *
         * 此处的方法只能访问public修饰的属性（已测试）
         */
        // 使用set()方法赋值
        noField.set(obj, 2222);

        // 获取属性的值
        System.out.println(noField.get(obj));

        // 如何访问非public修饰的属性呢？
        /**
         * 使用setAccessible()方法，置为true即可
         */
        // 获取Field
        Field nameField = studentClass.getDeclaredField("name");

        // 打破封装
        nameField.setAccessible(true);

        // 然后就可以进行赋值了
        nameField.set(obj, "zhangsan");

        // 取属性
        System.out.println(nameField.get(obj));

        // 封装回去呢？
        // 报异常
/*
        nameField.setAccessible(false);
        nameField.set(obj, "zhangsan");
*/


    }

}
