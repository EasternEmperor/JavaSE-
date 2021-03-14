package com.easterne.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap集合：
 *      1、HashMap集合底层是哈希表/散列表的数据结构
 *
 *      2、什么是哈希表？
 *          在java里，哈希表被表现成一个数组和单向链表的结合体
 *          数组：查询效率高，随机增删效率低
 *          链表：随机增删效率高，查询效率低
 *          而哈希表将以上的两种数据结构融合在一起，充分发挥它们各自的优点
 *
 *      3、HashMap集合底层的源代码：
 *          public class HashMap {
 *              // HashMap底层实际上就是一个一维数组
 *              Node<K, V>[] table;
 *
 *              // 静态内部类HashMap.Node
 *              static class Node<K, V> {
 *                  final int hash;     // 哈希值，是key通过hashCode()方法计算得，通过哈希算法可以转换成数组的下标
 *                  final K key;        // key值
 *                  V value;            // value值
 *                  Node<K,V> next;     // 下一个节点的内存地址
 *              }
 *          }
 *
 *      4、最主要掌握的是：
 *          map.put(k, v)
 *          v = map.get(k)
 *          以上两个方法的实现原理必须掌握。
 *
 *      5、HashMap集合的key部分特点：
 *          无序，不可重复
 *          为什么无序？因为不一定挂到哪个单向链表上
 *          不可重复是怎么保证的？equals()方法来保证HashMap集合的key不可重复
 *          如果key重复了，value会被覆盖
 *
 *          放在HashMap集合key部分的元素其实就是放到HashSet集合中去了
 *          所以key元素也需要同时重写HashCode()和equals()方法
 *
 *      6、哈希表HashMap使用不当时无法发挥性能！
 *          假设将所有的hashCode()方法返回值固定为某个值，那么会导致这个哈希表变成了
 *          纯单向链表。这种情况称为：散列分布不均匀
 *          什么是散列分布均匀?
 *              假设有100个元素，10个单向链表，那么每个单向链表上有10个节点，这是最好
 *              的，是散列分布均匀的
 *          假设将所有的hashCode()方法返回值都设定为不一样的值，会导致底层哈希表成为一
 *          维数组，没有链表的概念了，也是散列分布不均匀。
 *
 *          散列分布均匀需要重写hashCode()方法有一定技巧
 *
 *      7、重点：放到HashMap集合key部分的元素，以及放在HashSet集合中的元素，需要同时重写
 *      hashCode()和equals()方法
 *
 *      8、HashMap集合的默认初始化容量是16，默认加载因子是0.75
 *          默认加载因子意思是：当HashMap集合底层数组的容量达到75%时，开始扩容
 *
 *          重点：HashMap集合初始化容量必须是2的倍数。这是为达到散列均匀、提高HashMap集合
 *          的存取效率。
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
    }

}
