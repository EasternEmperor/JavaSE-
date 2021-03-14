package com.easterne.javase.annotation.myannotation3;

/**
 * 通过反射机制获取到注解！
 *      isAnnotationPresent()
 *      getAnnotation()
 *
 */
public class ReflectAnnotation {

    public static void main(String[] args) throws Exception {
        // 获取类
        Class c = Class.forName("com.easterne.javase.annotation.myannotation3.MyAnnotationTest");

        // 判断该类是否被MyAnnotation标注
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));  // true

        // 如果该类被注解标注，则获取到注解
        if (c.isAnnotationPresent(MyAnnotation.class)) {
            // 这里直接获取到了注解对象
            MyAnnotation ma = (MyAnnotation)c.getAnnotation(MyAnnotation.class);
            // 那么可以像普通对象一样，调用属性等
            System.out.println(ma.location());  // 江西省赣州市
        }

        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation.class));    // false
    }

}
