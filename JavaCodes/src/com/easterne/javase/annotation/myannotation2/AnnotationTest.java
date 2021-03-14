package com.easterne.javase.annotation.myannotation2;


// 报错！因为属性名不是value，而是name
//@OtherAnnotation("hehe")
public class AnnotationTest {

    @MyAnnotation("hehe")
    public void doSome() {

    }

}
