package com.easterne.javase.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 深入Collection的contains方法：
 *      boolean contains(Object o)
 *          判断集合是否包含某个元素，包含返回true，不包含返回false
 *          （注意：contains()底层实现是利用equals()方法，注意自己的类要重写equals()方法
 *                事实上，remove()方法底层也是用了equals()方法）
 */
public class CollectionTest04 {

    public static void main(String[] args) {
        // 创建集合
        Collection c = new ArrayList();

        String s1 = new String("abc");
        c.add(s1);

        String s2 = new String("def");
        c.add(s2);

        /**
         * 为什么以下代码是true？命名内存地址不一样：
         *      因为contains底层实现使用的是equals！所以事实上比较的是字符串，而不是内存地址
         */
        String s3 = new String("abc");
        System.out.println(c.contains(s3));     // true

    }

}
