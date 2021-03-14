package com.easterne.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * List集合存储元素特点：有序可重复
 *      有序：有下标，按照存入的先后顺序给予元素下标
 *      可重复：可以存储重复的元素
 *
 * List接口中特有的方法：
 *      1、void add(int index, Object element)
 *          向指定位置（index为下标）添加元素
 *
 *      2、Object get(int index)
 *          获取指定下标的元素
 *
 *      3、int indexOf(Object o)
 *          返回集合中第一个与o对象相同的元素下标（判断相同使用equals）
 *          如果不存在则返回-1
 *
 *      4、int lastIndexOf(Object o)
 *          返回集合中最后一个与o对象相同的元素下标（判断相同使用equals）
 *          如果不存在则返回-1
 *
 *      5、Object remove(int index)
 *          删除对应下标的元素
 *
 *      6、Object set(int index, Object element)
 *          将对应下标的元素替换成element
 *
 */
public class ListTest {

    public static void main(String[] args) {
        // 创建list类型的集合
        List myList = new ArrayList();

        // 添加元素
        myList.add("A");
        myList.add(3.14);
        myList.add(100);

        // void add(int index, Object element)
        // 使用较少，因为效率低
        myList.add(1, "King");
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("元素个数：" + myList.size());    // 4

        // Object get(int index)
        System.out.println("第3个元素：" + myList.get(2));      // 3.14

        // 使用get()方法，list集合的特有遍历方式
        for (int i = 0; i < myList.size(); i++)
            System.out.println(myList.get(i));

        // int indexOf(Object o)
        System.out.println("King的位置：" + myList.indexOf("King"));     // 1

        // int lastIndexOf(Object o)
        System.out.println("3.14的最后一次出现：" + myList.lastIndexOf(3.14));   // 2

        // Object remove(int index)
        System.out.println("删除：" + myList.remove(2));
        System.out.println("元素个数：" + myList.size());    // 3

        // Object set(int index, Object element)
        myList.set(2, "Hello JDK");
        System.out.println("第2个元素：" + myList.get(2));      // Hello JDK
    }

}
