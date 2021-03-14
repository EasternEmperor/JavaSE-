package com.easterne.javase.annotation.myannotation3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 要该注解可以标注类、方法
@Target({ElementType.TYPE, ElementType.METHOD})
// 要该注解能被反射机制读取到
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    // 属性
    String location() default "江西省赣州市";

}
