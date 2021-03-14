package com.easterne.javase.annotation.myannotation1;

/**
 * 自定义注解
 */
public @interface MyAnnotation {

    /**
     * 通常在注解中可以定义属性，以下便是MyAnnotation的name属性
     * 看着像方法，但是是注解的属性
     */
    String name();

    /**
     * 颜色属性
     */
    String color();

    /**
     * 年龄属性
     */
    int age() default 25;   // 属性指定默认值

}
