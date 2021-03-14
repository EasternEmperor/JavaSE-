package com.easterne.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * for each遍历数组（使用泛型后，类型固定）
 */
public class ForEachTest02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("Hello");
        list.add("World");
        list.add("King");

        // 迭代器遍历
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        // 下标遍历（使用get）
        System.out.println("-------------------------");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        // for each遍历
        System.out.println("-------------------------");
        for (String s : list) {
            System.out.println(s);
        }

        // for eachObject类遍历
        System.out.println("-------------------------");
        // for each遍历
        for (Object s : list) {
            System.out.println(s);
        }
    }

}
