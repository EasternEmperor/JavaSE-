package com.easterne.javase.annotation;

/**
 * 关于JDK lang包下的Override注解
 * 源代码：
 *      public @interface Override {
 *      }
 *
 * 标识性注解，给编译器做参考的
 * 编译器看到方法上有这个注解时，会自动检查该方法是否重写了父类的方法
 * 如果没有重写，则报错
 *
 * 这个注解只在编译阶段起作用，和运行阶段无关！
 */
public class OverrideTest {

    @Override
    public String toString() {
        return "toString";
    }

}
