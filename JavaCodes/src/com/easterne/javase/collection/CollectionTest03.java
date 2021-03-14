package com.easterne.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 关于集合遍历/迭代器，使用在所有Collection子实现类中（但是Map中不能使用以下方法）：
 * 查看迭代器Iterator的方法（初始时迭代器指向第一个元素的前一位，类似于栈帧）
 *      1、boolean hasNext()
 *          判断集合中是否有下一个元素
 *
 *      2、Object next()
 *          迭代器后移一位，并且将后移之后迭代器指向的元素以Object对象形式返回
 *
 *      3、default void remove()
 *          将当前迭代器指向的元素删除
 *
 * 迭代器注意事项：
 *      集合结构只要发生改变（新增或删除了元素），迭代器必须重新获取。
 *      所以在迭代过程中，不能调用集合自身的remove()方法，可以使用迭代器的remove()方法！
 */
public class CollectionTest03 {

    public static void main(String[] args) {

        /**
         * 对List类：有序可重复
         */
        Collection c = new ArrayList();
        // 添加元素
        c.add(100);
        c.add("Hello");
        c.add(new Object());

        // 使用迭代器遍历集合
        Iterator it = c.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
            it.remove();        // 删除当前元素
        }

        System.out.println(c.size());       // 0


        /**
         * 对Set类：无序不可重复
         */
        Collection h = new HashSet();
        // 无序：存进去的顺序和取出来的顺序不一定相同
        // 不可重复：集合中不会有重复的元素（存了100，不会再储存100了）
        h.add(100);
        h.add(50);
        h.add(500);
        h.add(90);
        h.add(100);     // 重复
        h.add(50);      // 重复

        // 迭代器取出元素
        Iterator it2 = h.iterator();
        System.out.println(h.size());       // 4
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }

}
