package com.easterne.javase.annotation.myannotation3;

/**
 * 使用注解标注
 */
@MyAnnotation
public class MyAnnotationTest {
    // 报错，因为该注解不能注释FIELD
/*    @MyAnnotation
    private String name;*/

    @MyAnnotation
    public void doSome() {

    }

}
