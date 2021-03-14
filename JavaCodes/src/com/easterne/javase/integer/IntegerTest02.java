package com.easterne.javase.integer;

/**
 * 8种基本数据类型对应的包装类型是：
 *      基本数据类型              包装类型
 *  -------------------------------------------
 *      byte                    java.lang.Byte（父类number）
 *      short                   java.lang.Short（父类number）
 *      int                     java.lang.Integer（父类number）
 *      long                    java.lang.Long（父类number）
 *      float                   java.lang.Float（父类number）
 *      double                  java.lang.Double（父类number）
 *      boolean                 java.lang.Boolean（父类Object）
 *      char                    java.lang.Character（父类Object）
 *
 * 2、以上8种包装类中，重点以java.lang.Integer为代表进行学习，其他的类型依葫芦画瓢即可
 *
 * 3、8中包装类中，其中6个的父类都是number，并且查阅可得number是抽象类，其中有抽象方法：
 *      byte	byteValue()     以byte类型返回指定数值
 *      double	doubleValue()   以double类型返回指定数值
 *      float	floatValue()    以float类型返回指定数值
 *      int	    intValue()      以int类型返回指定数值
 *      long	longValue()     以long类型返回指定数值
 *      short	shortValue()    以short类型返回指定数值
 */
public class IntegerTest02 {

    public static void main(String[] args) {

        // 123这个基本数据类型，通过构造方法的包装达到了：
        // 基本数据类型 --> 引用数据类型（装箱）
        Integer i = new Integer(123);

        // 而i这个引用数据类型，通过doubleValue()方法达到了：
        // 引用数据类型 --> 基本数据类型（拆箱）
        double d = i.doubleValue();
        System.out.println(d);      // 123.0

        byte b = i.byteValue();
        System.out.println(b);      // 123
    }

}
