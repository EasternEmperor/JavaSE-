package com.easterne.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * ArrayList集合：
 *      1、默认初始化容量是10（底层先创建了一个长度为0的数组，当添加第一个元素时，会扩容到10）
 *
 *      2、集合底层是一个Object[]数组
 *
 *      3、构造方法：
 *          new ArrayList();
 *          new ArrayList(100);     // 容量作为参数
 *
 *      4、ArrayList的扩容：
 *          原容量的1.5倍
 *          由于扩容会降低效率，所以在初始化时给定一个合适的容量，减少扩容次数
 *
 *      5、数组优点
 *          检索效率高（每个元素占用空间大小相同，内存地址连续，且知道首元素地址，知道下标，
 *                    可以通过数学运算得出元素的内存地址，所以检索效率高）
 *
 *      6、数组缺点
 *          随机增删元素效率低
 *          无法存储大数据量（很难找到一块大的连续空间）
 *
 *      7、向数组末尾添加元素效率很高
 *
 *      8、ArrayList是非线程安全的
 */
public class ArrayListTest {

    public static void main(String[] args) {

        // 默认初始化
        List list = new ArrayList();

        // 指定初始化容量
        List list1 = new ArrayList(100);

        // 将其他集合转化为ArrayList
        Collection h = new HashSet();
        h.add(100);
        h.add("Hello");
        List list2 = new ArrayList(h);
        // 遍历输出
        for (int i = 0; i < list2.size(); i++)
            System.out.println(list2.get(i));
    }

}
