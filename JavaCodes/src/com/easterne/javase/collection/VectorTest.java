package com.easterne.javase.collection;

import java.util.*;

/**
 * Vector：
 *      1、底层也是一个数组
 *
 *      2、初始化容量：10
 *
 *      3、怎么扩容的？
 *          扩容之后是原容量的2倍
 *
 *      4、Vector所有方法都带有synchronized关键字，是线程同步、线程安全的
 *         所以效率较低，使用较少
 *
 *      5、如何将非线程安全的ArrayList转为线程安全的？
 *          使用集合工具类：Collections
 *              区分：java.util.Collection：集合类
 *                  java.util.Collections：集合工具类
 */
public class VectorTest {

    public static void main(String[] args) {
        // 默认容量10
        List v = new Vector();

        // 添加元素：与ArrayList和LinkedList一样
        for (int i = 0; i < 10; i++)
            v.add(i);
        // 此处进行扩容
        v.add(11);

        // 迭代器遍历
        Iterator it = v.iterator();
        while (it.hasNext())
            System.out.println(it.next());


        // 将ArrayList转换为线程安全的
        List list = new ArrayList();
        // 使用集合工具类的方法：synchronizedList()，将其变成线程安全的
        Collections.synchronizedList(list);     // 多线程中用到

        // 此时list便为线程安全的了！
        list.add(10);
        list.add("Hello");

    }

}
