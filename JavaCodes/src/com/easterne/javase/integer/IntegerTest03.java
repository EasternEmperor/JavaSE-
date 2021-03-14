package com.easterne.javase.integer;

/**
 * 关于Integer类的构造方法，有两个：
 *      Integer(int)
 *      Integer(String)
 *
 * 以上构造方法不建议使用，因为使用new会创建对象，占用堆内存空间，造成浪费
 * 可以使用
 *      Integer i = 100;
 * 这种方式实际上调用了valueOf()方法，该方法使用缓存提高了空间的利用率和时间性能
 */
public class IntegerTest03 {

    public static void main(String[] args) {

        // 出现横线表明该方法已过时
        // 标准装箱方式（int --> Integer）
        Integer x = new Integer("123");
        System.out.println(x);
    }

}
