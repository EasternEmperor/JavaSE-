package com.easterne.javase.array;

/**
 * 关于数组每个类型的默认值：
 *      byte        0
 *      short       0
 *      int         0
 *      long        0
 *      float       0
 *      double      0
 *      boolean     false
 *      char        \u0000
 *      引用数据类型  -
 */
public class ArrayTest02 {

    public static void main(String[] args) {
        // int
        int[] a1 = new int[5];
        System.out.println("int:");
        for (int i = 0; i < a1.length; i++)
            System.out.println("a1[" + i + "] = " + a1[i]); // 0

        // String
        String[] s1 = new String[5];
        System.out.println("String:");
        for (int i = 0; i < s1.length; i++)
            System.out.println("s1[" + i + "] = " + s1[i]); // null

        // Object
        Object[] o1 = new Object[5];
        System.out.println("Object:");
        for (int i = 0; i < o1.length; i++)
            System.out.println("o1[" + i + "] = " + o1[i]); // null
    }

}
