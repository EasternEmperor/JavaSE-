package com.easterne.javase.string;

/**
 * String的构造方法：
 *      1、String(byte[] bytes)：
 *          根据bytes数组中的值，对应ASCII码的子母来创建
 *
 *      2、String(byte[] bytes, int offset, int length)：
 *          offset为bytes数组中的下标（要转换的字符串开始位置），length是要转换的字符串长度
 *
 *      3、String(char[] value)：
 *          将char数组中的所有字符连接为一个字符串
 *
 *      4、String(char[] value, int offset, int count)：
 *          同2，offset是value数组中的下标（要转换的字符串开始位置），count是要放入字符串的字符数
 *
 *      5、String(String original)：
 *          直接将传入的字符串创建出对象
 *
 *      6、""：
 *          最常用的
 */
public class StringTest03 {

    public static void main(String[] args) {
        // 1、String(byte[] bytes)
        byte[] bytes = {97, 98, 99};    // 97是a，98是b，99是c
        String s1 = new String(bytes);
        // 由于String类重写了toString()方法，所以print(s1)会输出s1指向的字符串
        System.out.println(s1);

        // 2、String(byte[] bytes, int offset, int length)
        String s2 = new String(bytes, 1, 2);
        System.out.println(s2);     // bc
        s2 = new String(bytes, 0, 2);
        System.out.println(s2);     // ab

        // 3、String(char[] value)
        char[] chars = {'我', '是', '中', '国', '人'};
        String s3 = new String(chars);
        System.out.println(s3);     // 我是中国人

        // 4、String(char[] value, int offset, int count)
        String s4 = new String(chars, 2, 3);
        System.out.println(s4);     // 中国人

        // 5、String(String original)
        String s5 = new String("Hello World");
        System.out.println(s5);

        // 6、""
        String s6 = "HW";
        System.out.println(s6);
    }

}
