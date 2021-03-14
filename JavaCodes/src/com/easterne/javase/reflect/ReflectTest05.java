package com.easterne.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射类型中所有的Field：
 *      Field是类中的属性，包括修饰符（可能有多个）、类型（如int、char...）、
 *      变量名
 */
public class ReflectTest05 {

    public static void main(String[] args) throws Exception {

        // 获取整个类
        Class studentClass = Class.forName("com.easterne.javase.reflect.bean.Student");

        // 输出类名
        String className = studentClass.getName();
        System.out.println(className);      // 带包名:com.easterne.javase.reflect.bean.Student
        String simpleName = studentClass.getSimpleName();
        System.out.println(simpleName);     // 只有类名:Student

        // 获取类中所有被public修饰的Field
        Field[] fields = studentClass.getFields();  // 注意：只能获取public的变量！
        System.out.println(fields.length);      // 2，包括常量

        System.out.println("========================================");

        // 获取所有Field
        Field[] fields1 = studentClass.getDeclaredFields();
        System.out.println(fields1.length);     // 5

        // 遍历Fields1
        for (Field field : fields1) {

            // 获取属性修饰列表
            // 这里返回的int是修饰符的编号
            int i = field.getModifiers();
            System.out.println(i);
            // 将该编号转换为字符串
            String modifiers = Modifier.toString(i);
            System.out.println(modifiers);

            // 获取属性类型
            // 注意：返回的是Class类型
            Class fieldClass = field.getType();
            // 以下除了基本数据类型，其他类型是带包名的
            //String fieldType = fieldClass.getName();
            // 简化类型名
            String fieldType = fieldClass.getSimpleName();
            System.out.println(fieldType);
            // 以下这句也可以获取到Field的类型，也是带包名的！
            //System.out.println(fieldClass.getTypeName());

            // 获取变量名
            String fieldName = field.getName();
            System.out.println(fieldName);

        }

    }

}
