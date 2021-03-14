package com.easterne.javase.collection;

import java.util.TreeSet;

/**
 * 1、TreeSet集合底层是一个TreeMap
 * 2、TreeMap集合底层是一个二叉树
 * 3、放到TreeSet集合中的元素，等同于放到TreeMap集合的key部分了
 * 4、TreeSet集合中的元素：无序不可重复。
 * 5、TreeSet和TreeMap集合会自动按照元素的大小（或者字典顺序）升序排序，称为：可排序集合
 */
public class TreeMapTest {

    public static void main(String[] args) {
        // 创建一个TreeSet集合
        TreeSet<String> treeSet = new TreeSet<>();
        // 添加String
        treeSet.add("zhangsan");
        treeSet.add("zhangsi");
        treeSet.add("wangwu");
        treeSet.add("wangliu");
        // 遍历输出
        for (String s : treeSet)
            System.out.println(s);

        // 再来Integer泛型的
        TreeSet<Integer> ts = new TreeSet<>();
        // 添加Integer
        ts.add(50);
        ts.add(20);
        ts.add(30);
        ts.add(5);
        // 遍历
        for (Integer i : ts)
            System.out.println(i);

    }

}
