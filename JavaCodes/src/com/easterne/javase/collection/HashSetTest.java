package com.easterne.javase.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet集合：
 *      无序不可重复
 */
public class HashSetTest {

    public static void main(String[] args) {
        // 演示HashSet集合的特点
        Set<String> stringSet = new HashSet<>();

        // 添加元素
        for (int i = 0; i < 10; i++)
            stringSet.add("Hello" + i);

        for (int i = 0; i < 10; i++)
            stringSet.add("Hello" + i);


        // for each遍历Set
        // 从输出可以看出无序、不可重复的特点
        for (String s : stringSet)
            System.out.println(s);
    }

}
