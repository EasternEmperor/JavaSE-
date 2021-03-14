package com.easterne.javase.exception;

/**
 * 之前在讲解方法的覆盖时，讲到：
 *      重写之后的方法不能比重写之前的方法抛出更多（更宽泛）的编译时异常，可以更少
 */
public class ExceptionTest13 {

    public static void main(String[] args) {

    }

}

class Animal {
    // 未抛出异常，则重写后的doSome()方法也不能抛出异常
    public void doSome() {

    }

    // 抛出Exception，则重写后的doOther()方法只能抛出一个异常，且可以为Exception或者其子类异常
    public void doOther() throws Exception{

    }
}

class Cat extends Animal {

    // 运行时异常可以抛出
    public void doSome() throws RuntimeException {

    }

    // 编译报错
/*    public void doSome() throws Exception {

    }*/

    // 抛出Exception子类：NullPointerException
    public void doOther() throws NullPointerException {

    }
}
