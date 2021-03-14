package com.easterne.javase.collection;

import java.util.TreeSet;

/**
 * 对自定义的类型来说，TreeSet可以排序吗？
 *      以下程序中对于Product类型来说，无法排序。因为没有指定Product对象之间的比较规则，
 *      所以无法排序。
 *
 *      以下程序运行出现以下异常：
 *          java.lang.ClassCastException
 *      出现该异常的原因是：
 *          Product类没有实现java.lang.Comparable接口
 */
public class TreeMapTest02 {

    public static void main(String[] args) {
        Product p1 = new Product(100);
        Product p2 = new Product(20);
        Product p3 = new Product(30);
        Product p4 = new Product(50);

        // 创建TreeSet集合
        TreeSet<Product> ts = new TreeSet<>();
        // 添加元素
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);

        // 遍历
        for (Product p : ts)
            System.out.println(p);

    }

}

class Product {
    private int no;

    public Product(int no) {
        this.no = no;
    }

    public String toString() {
        return "Product{" +
                "no=" + no +
                '}';
    }
}
