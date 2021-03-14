package com.easterne.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 由一个类名，通过Field获取其中所有变量的测试
 */
public class ReflectTest06 {

    public static void main(String[] args) throws Exception {

        // 使用StringBuilder拼接字符串
        StringBuilder sb = new StringBuilder();

        // 获取类
        //Class className = Class.forName("com.easterne.javase.reflect.bean.Student");
        Class className = Class.forName("java.lang.String");

        // 将类名及其修饰符加入
        sb.append(Modifier.toString(className.getModifiers()) + " class " + className.getSimpleName());

        sb.append(" {\n");

        // 获取类中的变量
        Field[] fields = className.getDeclaredFields();
        for (Field field : fields) {

            // 最前面的制表符
            sb.append("\t");

            // 获取修饰符
            int mod = field.getModifiers();
            sb.append(Modifier.toString(mod));
            sb.append(" ");

            // 获取类型
            Class fieldClass = field.getType();
            sb.append(fieldClass.getSimpleName());
            sb.append(" ");

            // 获取变量名
            sb.append(field.getName());

            // 最后的封号
            sb.append(";\n");

        }

        sb.append("\n}");

        System.out.println(sb);

    }

}
