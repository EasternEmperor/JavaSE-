package com.easterne.javase.collection;

import java.util.TreeSet;

/**
 *
 */
public class TreeMapTest03 {

    public static void main(String[] args) {
        Blank p1 = new Blank("no105");
        Blank p2 = new Blank("no220");
        Blank p3 = new Blank("no35");
        Blank p4 = new Blank("no45");

        // 创建TreeSet集合
        TreeSet<Blank> ts = new TreeSet<>();
        // 添加元素
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);

        // 遍历
        for (Blank p : ts)
            System.out.println(p);

    }

}

class Blank implements Comparable<Blank>{
    private String no;

    public Blank(String no) {
        this.no = no;
    }

    public String toString() {
        return "Blank{" +
                "no='" + no + '\'' +
                '}';
    }

    // 重写compareTo()方法
    // 需要在这个方法里编写比较的逻辑：按照什么规则进行比较
    public int compareTo(Blank o) {
        return this.no.compareTo(o.no);
    }
}
