package com.easterne.javase.annotation;

/**
 * 注解：
 *      1、注解，或者叫注释类型，英文单词为：Annotation
 *
 *      2、注解Annotation是一种引用数据类型，编译后也生成.class文件
 *
 *      3、如何自定义注解？语法格式？
 *          [修饰符列表] @interface 注解类型名 {
 *
 *          }
 *
 *      4、注解怎么使用？用在什么地方？
 *          - 注解使用时的语法格式是：
 *              @注解名
 *
 *          - 注解可以出现在类上、属性上、方法上、变量上...
 *          注解也可以出现在注解类型上
 *
 *      5、元注解
 *          - 什么是元注解？
 *              用来标注”注解类型“的注解，称为”元注解“
 *
 *          - 常见的元注解：
 *              Target
 *              Retention
 *
 *      6、关于Target注解：
 *          这是一个元注解，用来标注”被标注的注解“可以出现在哪些位置上
 *          比如：
 *              @Target(ElementType.METHOD)：表示”被标注的注解“只能出现在方法上
 *
 *      7、关于Retention注解：
 *          这是一个元注解，用来标注”被标注的注解“最终保存在哪里
 *          比如：
 *              @Retention(RetentionPolicy.SOURCE)：表示该注解只被保留在java源文件中
 *              @Retention(RetentionPolicy.CLASS)：表示该注解只被保留在Class文件中
 *              @Retention(RetentionPolicy.SOURCE)：表示该注解只被保留在Class文件中，且可以被反射机制读取到
 *
 *      8、注解中的属性类型可以是：
 *          byte, short, int, long, float, double, boolean, char, String, Class, 枚举类型
 *          以及以上每一种类型的数组状态！
 *
 */
public class AnnotationPoints {
}
