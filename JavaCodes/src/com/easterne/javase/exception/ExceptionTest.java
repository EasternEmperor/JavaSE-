package com.easterne.javase.exception;

/**
 * 1、什么是异常？java提供异常处理机制有什么用？
 *      异常指程序运行过程中发生了不正常的情况；
 *      JVM把该异常信息打印输出到控制台，供程序员参考。程序员看到异常信息后，
 *      可以对程序进行修改，使程序更加健壮。
 *
 * 2、java中异常以什么形式存在？
 *      - 异常在java中以类的形式存在，每一个异常都可以创建对象（有toString方法，
 *        所以可以打印输出到控制台）
 *
 * 3、什么是UML？有什么用？
 *      UML是一种统一建模语言，其以面向对象图的方式来描述任何类型的系统
 *
 * 4、Object下的Throwable（可抛出的）
 *      Throwable下有两个分支：Error（不可处理，发生后会直接退出JVM）和Exception（可处理的）
 *          Exception下有两个分支：
 *              - Exception的直接子类：ExceptionSubClass（编译时异常，又叫受检异常和受控异常），
 *                                  要求程序员在程序编写阶段必须预先对这些异常进行处理
 *
 *              - 另一个子类：RuntimeException（运行时异常，又叫非受检异常和非受控异常）
 *
 *              - 编译时异常和运行时异常，都是发生在运行阶段，编译阶段异常是不会发生的。
 *                编译时异常：必须在编写阶段预先处理，否则编译器报错。所有异常都是发生在运行阶段的，因为
 *                只有运行阶段才可以new对象（异常对象也是）
 *
 *              - 编译时异常一般发生概率较高
 *                运行时异常一般发生概率较低
 *
 * 5、如果java中没有对异常划分为编译时异常和运行时异常，结果是：
 *      程序肯定是绝对安全的，但是程序员编写代码会非常辛苦，代码到处都在处理异常。
 *
 * 6、java语言中对异常的处理包括两种方式：
 *      第一种方式：在方法声明的位置上，使用throws关键字，抛给上一级。
 *              谁调用我，我就抛给谁。
 *      第二种方式：使用try...catch语句进行异常的捕捉
 */
public class ExceptionTest {

    public static void main(String[] args) {
        // 通过“异常类”实例化“异常对象”
        NumberFormatException nfe = new NumberFormatException("数字格式化异常！");
        System.out.println(nfe);        // java.lang.NumberFormatException: 数字格式化异常！

        NullPointerException npe = new NullPointerException("空指针异常！");
        System.out.println(npe);        // java.lang.NullPointerException: 空指针异常！
    }

}
