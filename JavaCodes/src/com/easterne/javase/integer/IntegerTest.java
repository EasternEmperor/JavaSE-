package com.easterne.javase.integer;

/**
 * 1、java中为8中基本数据类型又对应准备了8种包装类型。8种包装类属于引用数据类型，父类是Object
 *
 * 2、思考：为什么要再提供8种包装类呢？
 *      因为8种基本数据类型不够用。有时需要向形参为Object类型的方法传入8种基本数据类型。
 *      所以SUN公司又提供了对应的8中包装类型
 */
public class IntegerTest {

    // 举例
    public static void main(String[] args) {
        // 考虑以下需求：
        // 调用doSome()方法时，要传入一个数字
        // 由于数字为基本数据类型，而doSome()参数是Object
        // 此时可以传入一个数字对应的包装类
        MyInt mi = new MyInt(100);
        doSome(mi);
    }

    public static void doSome(Object obj) {
        System.out.println(obj);        // 调用的是obj的toString方法
    }

}

class MyInt {
    public int num;

    public MyInt() {
    }

    public MyInt(int num) {
        this.num = num;
    }

    public String toString() {
        return "MyInt{" +
                "num=" + num +
                '}';
    }
}
