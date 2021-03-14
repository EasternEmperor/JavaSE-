package com.easterne.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Method反射机制
 */
public class ReflectTest08 {

    public static void main(String[] args) throws ClassNotFoundException {

        // 获取类
        Class userServiceClass = Class.forName("com.easterne.javase.reflect.bean.UserService");

        // 获取所有Method（包括私有的！）
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);     // 2

        // 遍历methods
        for (Method method : methods) {
            // 获取修饰符列表
            String modifiers = Modifier.toString(method.getModifiers());
            System.out.println(modifiers);

            // 获取返回值类型
            Class retType = method.getReturnType();
            String retValue = retType.getSimpleName();
            System.out.println(retValue);

            // 获取方法名
            String methodName = method.getName();
            System.out.println(methodName);

            // 获取参数列表
            Class[] parameters = method.getParameterTypes();
            // 输出
            for (Class para : parameters) {
                // 获取参数类型
                String paraType = para.getSimpleName();
                System.out.println(paraType);
            }
        }

    }

}
