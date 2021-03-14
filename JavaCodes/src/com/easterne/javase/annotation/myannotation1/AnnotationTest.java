package com.easterne.javase.annotation.myannotation1;

public class AnnotationTest {

    // 以下这段代码会报异常，因为没有给注解MyAnnotation的属性赋值！
/*    @MyAnnotation()
    public void doSome() {

    }*/

    // 这里要给name和color属性赋值
    // 而age由于有默认值，可以不赋值！
    @MyAnnotation(name = "zhangsan", color = "red")
    public void doSome() {

    }

}
