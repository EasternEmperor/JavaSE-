package com.easterne.javase.collection;

import java.util.*;

/**
 * java.util.Collection    集合接口
 * java.util.Collections    集合工具类，方便集合的操作
 */
public class CollectionsTest {

    public static void main(String[] args) {
        // ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();
        // 变成线程安全的
        Collections.synchronizedList(list);

        // 排序
        list.add("123");
        list.add("111");
        list.add("112");

        Collections.sort(list);
        // 遍历输出观察排序后的结果
        for (String s : list)
            System.out.println(s);

        // 如果存入的是自己编写的类，则需要实现Comparable接口才能进行排序
        // 或者在排序时，传入一个比较器！
        List<WuGui> wuGuis = new ArrayList<>();
        wuGuis.add(new WuGui(500));
        wuGuis.add(new WuGui(100));
        wuGuis.add(new WuGui(50));
        // 报错，因为WuGui没有实现Comparable接口
        //Collections.sort(wuGuis);
        // 所以传入一个比较器来进行排序
        Collections.sort(wuGuis, new WuGuiComparator());
        for (WuGui w : wuGuis)
            System.out.println(w);

        /** 对于Set集合排序：
         * 先将Set集合转换位List集合，再使用Collections.sort()排序
         */
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("H");
        set.add("HW");
        // 转换方法：将Set集合作为构造函数的参数传入即可
        List<String> transList = new ArrayList<>(set);
        Collections.sort(transList);
        for (String s : transList)
            System.out.println(s);
    }

}
