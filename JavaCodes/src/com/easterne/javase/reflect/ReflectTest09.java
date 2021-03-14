package com.easterne.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 反编译一个类的所有方法(Method)
 */
public class ReflectTest09 {

    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();
        // 获取类
        //Class USClass = Class.forName("com.easterne.javase.reflect.bean.UserService");
        Class USClass = Class.forName("java.lang.String");
        sb.append(Modifier.toString(USClass.getModifiers()) + " class " + USClass.getSimpleName());
        sb.append(" {\n");

        // 获取所有方法
        Method[] methods = USClass.getDeclaredMethods();
        for (Method method : methods) {
            sb.append("\t");
            // 获取方法的修饰符
            sb.append(Modifier.toString(method.getModifiers()));
            sb.append(" ");
            // 获取方法的返回值
            sb.append(method.getReturnType().getSimpleName());
            sb.append(" ");
            // 获取方法名
            sb.append(method.getName());
            // 获取参数列表
            sb.append("(");
            Class[] paras = method.getParameterTypes();
            for (int i = 0; i < paras.length; i++) {
                // 获取参数类型
                sb.append(paras[i].getSimpleName());
                // 如果不是最后一个参数，那么要有分隔的','
                if (i != paras.length - 1)
                    sb.append(", ");
            }

            sb.append(")");
            sb.append(" {}\n");
        }

        sb.append("}");
        System.out.println(sb);
    }

}
