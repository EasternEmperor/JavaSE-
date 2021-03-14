package com.easterne.javase.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Hashtable和HashMap的区别：
 *      Hashtable的key和value不允许为null
 *      而HashMap的key和value都可以为null
 *
 * Hashtable和HashMap一样，底层都是哈希表数据结构
 * Hashtable的初始化容量为11，默认加载因子是0.75
 * Hashtable的扩容是：原容量 * 2 + 1
 *
 * Hashtable是线程安全的，方法都带有synchronized，导致效率较低
 */
public class HashtableTest {

    public static void main(String[] args) {
        // key和value都为null情况
        Map hashtable = new Hashtable();

        // 以下抛出空指针异常
        //hashtable.put(null, 100);

        Map hashMap = new HashMap();

        hashMap.put(null, 100);
        System.out.println(hashMap.get(null));  // 100

    }

}
