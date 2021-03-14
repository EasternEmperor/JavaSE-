package com.easterne.javase.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合中元素排序的第二种方式：使用比较器的方式
 *
 * 最终结论：
 *      放到TreeSet或者TreeMap集合key部分的元素要想做到排序，包括两种方式：
 *          - 放在集合中的元素实现java.lang.Comparable接口
 *          - 在构造TreeSet或者TreeMap集合时，传入一个比较器对象！
 *
 * Comparable和Comparator如何选择？
 *      当比较规则不会发生变化时，或者说比较规则只有1个时，建议实现Comparable接口
 *      如果比较规则多样化，并且需要在多个比较规则里频繁切换，建议传入Comparator对象
 *
 *      Comparator接口的设计符合OCP原则(Open Close Principle)
 */
public class TreeMapTest04 {

    public static void main(String[] args) {
        // 创建TreeSet集合的时候，需要传入一个比较器
        // 所以不能使用无参的构造方法了！！！
        //TreeSet<WuGui> ts = new TreeSet<>(new WuGuiComparator());

        /** 或者直接使用匿名内部类的方式
         * 在传入参数时时声明一个比较器！
         */
        TreeSet<WuGui> ts = new TreeSet<>(new Comparator<WuGui>() {
            public int compare(WuGui o1, WuGui o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 创建WuGui对象
        WuGui w1 = new WuGui(100);
        WuGui w2 = new WuGui(50);
        WuGui w3 = new WuGui(90);;
        WuGui w4 = new WuGui(30);

        // 将以上对象加入TreeSet集合
        ts.add(w1);
        ts.add(w2);
        ts.add(w3);
        ts.add(w4);

        // 遍历输出
        for (WuGui w : ts)
            System.out.println(w);

    }

}

class WuGui {
    private int age;

    public WuGui(int age) {
        this.age = age;
    }

    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class WuGuiComparator implements Comparator<WuGui> {

    // 指定比较规则
    public int compare(WuGui o1, WuGui o2) {
        return o1.getAge() - o2.getAge();
    }
}
