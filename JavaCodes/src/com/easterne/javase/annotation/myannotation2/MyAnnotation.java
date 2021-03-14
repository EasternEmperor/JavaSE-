package com.easterne.javase.annotation.myannotation2;

public @interface MyAnnotation {
    // 注解中属性名是value，且该注解只有一个注解时，赋值时可以省略"value = "
    String value();
}
