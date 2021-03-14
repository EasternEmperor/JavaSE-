package com.easterne.javase.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 遍历Map集合：
 *      1、先使用keySet()方法获取key集合，再通过get(Object key)
 *
 *      2、调用方法Set<Map.Entry<K, V>> entrySet()，返回一个Set集合，
 *      储存元素类型为：Map.Entry<K, V>>，其中有私有成员变量：key和value，
 *      所以可以通过遍历返回的Set集合中的Map.Entry<K, V>>元素的key和value，
 *      相当于遍历Map集合
 *
 *      3、以上两种方法：方法2效率高，适合进行大数据量作业
 */
public class MapTest02 {

    public static void main(String[] args) {

        /** 第一种方式：先使用keySet()方法获取key集合，再通过get(Object key)
         * 方法获取key对应的value
         */
        Map<Integer, String> map = new HashMap();
        map.put(1, "zhangsan");     // 自动装箱
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        // 获取key集合
        Set<Integer> set = map.keySet();

        // 1、迭代器遍历
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            // 通过key获取value
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("----------------------");

        // 2、for each遍历
        for (Integer key : set) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }


        System.out.println("*****************************");

        /** 第二种方式：调用方法Set<Map.Entry<K, V>> entrySet()
         */
        Set<Map.Entry<Integer, String>> entry = map.entrySet();

        // 1、迭代器遍历，每次取出一个Map.Entry类型的数据（其实是Node）
        Iterator<Map.Entry<Integer, String>> it2 = entry.iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, String> node = it2.next();
            // 通过取出的node访问key和value
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("--------------------");

        // 2、for each
        for (Map.Entry<Integer, String> node : entry) {
            // 通过取出的node访问key和value
            Integer key = node.getKey();
            String value = node.getValue();
            System.out.println(key + "=" + value);
        }

    }

}
