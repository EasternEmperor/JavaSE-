package com.easterne.javase.array;

/**
 * 关于一维数组的扩容：
 *      在java开发中，数组长度不可变，那么数组满了怎么办？
 *          数组满了，需要扩容。
 *          先新建一个大容量的数组，然后将小容量数组的数据一个个拷贝到大数组当中
 *
 * 结论：数组扩容效率较低。因为涉及到拷贝的问题。所以在以后的开发中请注意：尽可能减少数组的拷贝
 *      创建数组时最好预估准确，减少数组扩容次数，提高效率
 *
 * 数组拷贝方法：System.arraycopy(Object src,  int  srcPos,    // 源数组
 *                             Object dest, int destPos,    // 目标数组
 *                             int length);
 */
public class ArrayTest06 {

    public static void main(String[] args) {
        // 拷贝源
        int[] src = {1, 11, 22, 3, 4};
        // 拷贝目标（拷贝到这个数组中）
        int[] des = new int[10];    // 动态初始化的10长度数组

        // 调用System.arraycopy()
        // 以下参数的意思：从源数组src的下标1开始，拷贝长度为2，拷贝到目标数组des下标3开始的位置！！！
        System.arraycopy(src, 1, des, 3, 2);

        // 遍历输出目标数组
        for (int i = 0; i < des.length; i++)
            System.out.println(des[i]);

        // 判断是深复制还是浅复制？
        // 通过以下代码结论：arraycopy是深复制！
        /*
        src[1] = 22;
        // 遍历输出目标数组
        for (int i = 0; i < des.length; i++)
            System.out.println(des[i]);
        */

        // 虽然以上示例是int，但是如果是引用数据类型数组是一样的！
    }

}
