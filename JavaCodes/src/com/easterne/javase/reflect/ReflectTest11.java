package com.easterne.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * Constructor构造方法：
 *      反编译构造方法
 */
public class ReflectTest11 {

    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();

        // 获取类
        //Class vipClass = Class.forName("com.easterne.javase.reflect.bean.Vip");
        Class vipClass = Class.forName("java.lang.String");
        // 拼接类头部
        sb.append(Modifier.toString(vipClass.getModifiers()));
        sb.append(" class ");
        sb.append(vipClass.getSimpleName());
        sb.append(" {\n");

        // 获取构造方法
        Constructor[] constructors = vipClass.getDeclaredConstructors();
        // 遍历构造方法
        for (Constructor cs : constructors) {
            sb.append("\t");
            // 拼接构造方法
            // 修饰符列表
            sb.append(Modifier.toString(cs.getModifiers()));
            sb.append(" ");
            // 构造方法名与类名相同
            sb.append(vipClass.getSimpleName());

            // 参数列表
            sb.append("(");
            Class[] paras = cs.getParameterTypes();
            for (int i = 0; i < paras.length; i++) {
                sb.append(paras[i].getSimpleName());
                // 最后一个参数后不用','
                if (i != paras.length - 1)
                    sb.append(", ");
            }

            sb.append(") {}\n");
        }

        sb.append("}");

        System.out.println(sb);
    }

}
