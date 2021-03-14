package com.easterne.javase.integer;

/**
 * 自动装箱和自动拆箱：
 *      其实是使用了valueOf()，利用缓存提高空间利用率和时间效率
 */
public class IntegerTest05 {

    public static void main(String[] args) {
        // 自动装箱
        Integer i = 1000;
        System.out.println(i);

        // 自动拆箱
        int y = i;
        System.out.println(y);

        // 在运算时也可以进行自动拆箱，减少代码量
        // 但事实上，由于i是引用数据类型，i保存的还是内存地址
        System.out.println(i + 1);

        // 知识盲区：缓存机制
        /**
         * 包装类中，如果一个int数字之前使用过自动装箱创建对象，那么再次使用该int数字
         * 自动装箱时，如果该数字在区间[-128, 127]之间，那么第二次创建包装类对象会直接
         * 从缓存中取对象来创建。即实际上第一次创建的和第二次创建的对象内存地址是一样的。
         * 而如果该数字在区间[-128, 127]之外，则不会使用缓存机制
         */
        // 代码检测：
        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println("i1 == i2: " + (i1 == i2));  // true
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i3 == i4: " + (i3 == i4));  // false
        // 下面更改i1的值后，i1和i2对应的地址便不相等了
        i1 += 20;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println("i1 == i2: " + (i1 == i2));
        // 这里创建i5=120，由于120属于[-128, 127]之间，所以i5也会直接从缓存中取对应地址！
        Integer i5 = 120;
        System.out.println("i1 == i5: " + (i1 == i5));  // true
    }

}
