package com.easterne.javase.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList：双向链表
 *
 * 链表的优点：
 *      由于链表上的元素在空间存储上内存地址不连续，所以随机增删元素的时候
 *      不会有大量元素位移，因此随即增删效率高。
 *      在开发中，遇到随机增删操作业务较多时，建议使用LinkedList
 *
 * 链表的缺点：
 *      不能通过数学表达式计算被查找元素的内存地址，每一次查找都是从头节点
 *      开始遍历。所以LinkedList集合检索/查找的效率较低
 *
 * LinkedList集合没有初始化容量，最初链表没有任何元素，first和last都是null
 * 面向接口编程，调用的都是接口的方法
 */
public class LinkedListTest {

    public static void main(String[] args) {
        // LinkedList也是有下标的！
        // 所以效率是与底层数据结构（数组和链表）有关，而不是下标！
        List l = new LinkedList();
        l.add("Hello");
        l.add(100);
        l.add(3.14);

        // 使用get()方法通过下标遍历链表
        for (int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));
    }

}
