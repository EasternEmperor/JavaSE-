package com.easterne.javase.collection;

import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet集合存储元素特点：
 *      1、无序不可重复，但是存储的元素可以进行排序。
 *      称为可排序集合
 *
 *      2、无序：指的是存进去的顺序和取出来的顺序不同，并且没有下标
 */
public class TreeSetTest {

    public static void main(String[] args) {
        // 创建集合对象
        Set<String> stringSet = new TreeSet<>();

        // 添加元素
        // TreeSet会按照字符串的第一个字符的字典顺序排序！
        for (int i = 10; i > 0; i--)
            stringSet.add(i + "");

        // for each 遍历
        for (String s : stringSet)
            System.out.println(s);
    }

}
