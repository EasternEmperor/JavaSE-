package com.easterne.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的超级父接口Collection中的常用方法：
 *      1、Collection中能存放什么元素？
 *          没有使用”泛型“之前，Collection中可以存放Object的所有子类型。
 *          使用了泛型之后，Collection中只能存放某个具体的类型。
 *          （注：集合中不能直接存放基本数据类型，也不能存放Java对象，只是
 *          存储Java对象的内存地址，即引用）
 *
 *      2、boolean add(E e)
 *          添加元素
 *
 *      3、int size()
 *          获取集合中元素个数
 *
 *      4、void clear()
 *          清空集合
 *
 *      5、boolean contains(Object o)
 *          判断集合中是否存在该元素
 *
 *      6、boolean remove(Object o)
 *          删除某个元素（如果集合中不存在该元素则会返回false）
 *
 *      7、boolean isEmpty()
 *          判断集合是否为空（空返回true，非空返回false）
 *
 *      8、Object[] toArray()
 *          将集合转换为Object数组
 */
public class CollectionTest02 {

    public static void main(String[] args) {
        // 创建一个集合对象
        //Collection c = new Collection();  // 接口无法实例化
        // 使用多态
        Collection c = new ArrayList();

        // boolean add(E e)
        c.add(100);         // 自动装箱，实际上放进去的是Integer对象的内存地址
        c.add(3.14);        // 自动装箱
        c.add(new Student());
        c.add(true);        // 自动装箱

        // int size()
        System.out.println("集合中元素个数为：" + c.size());     // 4

        // void clear()
        c.clear();
        System.out.println("集合中元素个数为：" + c.size());     // 0

        c.add("Hello");     // "Hello"对象的内存地址放入了集合
        c.add(3.14);
        c.add("ee");
        c.add(new Student());

        // boolean contains(Object o)
        System.out.println(c.contains(3.14));       // true
        System.out.println(c.contains(100));        // false

        // boolean remove(Object o)
        c.remove(3.14);
        c.remove(100);      // 虽然不存在，但是也可以作为参数传入，返回值为false
        System.out.println("集合中元素个数为：" + c.size());     // 2

        // boolean isEmpty()
        System.out.println(c.isEmpty());        // false

        // Object[] toArray()
        Object[] objs = c.toArray();
        for (int i = 0; i < objs.length; i++) {
            System.out.println(objs[i]);        // 调用toString()方法
        }
    }

}

class Student {

}
