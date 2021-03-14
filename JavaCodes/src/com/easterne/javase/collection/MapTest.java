package com.easterne.javase.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * java.util.Map接口中常用的方法：
 *      1、Map和Collection没有继承关系
 *
 *      2、Map以key和value的方式存储数据：键值对
 *          key和value都是引用数据类型
 *          key和value都是储存对象的内存地址
 *          key起到主导的作用，value是key的一个附属品
 *
 *      3、Map接口中的常用方法：
 *          V put(K key, V value)               向Map集合中添加键值对
 *          V get(Object key)                   通过key获取value
 *          void clear()                        清空Map集合
 *          boolean containsKey(Object key)     判断Map中是否存在某个key
 *          boolean containsValue(Object value) 判断Map中是否存在某个value
 *          boolean isEmpty()                   判断Map集合中元素个数是否为0
 *          Set<K> keySet()                     获取Map集合中所有的key，作为Set集合传出
 *          V remove(Object key)                通过key删除键值对
 *          int size()                          获取Map集合中的键值对个数
 *          Collection<V> values()              获取Map集合中所有的value，返回一个Collection
 *
 *          Set<Map.Entry<K, V>> entrySet()：
 *              将Map集合转换为Set集合
 *              假设有如下的Map集合：
 *              map1集合对象
 *              key         value
 *              -----------------
 *              1           zhang
 *              2           san
 *              3           wu
 *
 *              Set set = map1.entrySet();
 *              set集合对象保存的值为：
 *              1=zhang     【注意：Map集合通过entrySet()方法转换的Set集合中的元素类型为：Map.Entry】
 *              2=san       【Map.Entry是Map中的静态内部类】
 *              3=wu
 *
 */
public class MapTest {

    public static void main(String[] args) {
        // 使用上述方法

        // 创建HashMap
        Map<Integer, String> map = new HashMap<>();

        // V put(K key, V value)
        map.put(1, "zhangsan");     // 自动装箱
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "zhaoliu");

        // V get(Object key)
        System.out.println(map.get(2));     // lisi

        // boolean containsKey(Object key)
        System.out.println("map集合中包含4吗？" + map.containsKey(4));     // true

        // boolean containsValue(Object value)
        System.out.println("map集合中包含\"feiji\"吗？" + map.containsValue("feiji")); // false

        // boolean isEmpty()
        // int size()
        System.out.println("map集合为空吗?" + map.isEmpty());        // false
        System.out.println("map集合有多少对键值对？" + map.size());    // 4

        // Set<K> keySet()
        Set<Integer> set = map.keySet();
        // 遍历输出
        for (Integer i : set)
            System.out.println(i);

        // V remove(Object key)
        map.remove(2);
        // 通过key得到value，来遍历
        for (Integer i : map.keySet()) {
            System.out.println(map.get(i.intValue()));
        }
        System.out.println("map集合有多少对键值对？" + map.size());    // 3

        // void clear()
        map.clear();
        System.out.println("map集合有多少对键值对？" + map.size());    // 0

    }

}
