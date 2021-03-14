package com.easterne.javase.string;

/**
 * String类中的常用方法：
 *      1、char charAt(int index)：
 *          查找index下标上的字符，并返回
 *
 *      2、int compareTo(String anotherString)：
 *          通过字典顺序比较两个字符串，返回（前一个字符串 和 后一个字符串）的编码差
 *          注意：比对到第一个不相同的字符为止
 *
 *      3、boolean contains(CharSequence s)：
 *          如果包含该字符串则返回true，否则返回false
 *
 *      4、boolean endsWith(String suffix)：
 *          判断是否以某个字符串结尾：若是，返回true；否：返回false
 *
 *      5、boolean equals(Object anObject)：
 *          判断字符串是否相等：若是，返回true；否：返回false
 *
 *      6、boolean equalsIgnoreCase(String anotherString)：
 *          忽略大小写的比较字符串是否相等
 *
 *      7、byte[] getBytes()：
 *          将字符串对象转换成字节数组（根据编码）
 *
 *      8、int indexOf(String str)：
 *          判断某个子字符串在当前字符串第一次出现处的下标索引
 *
 *      9、boolean isEmpty()：
 *          判断字符串是否为空：空，返回true；非空，返回false
 *
 *      10、int length()：
 *          返回字符串的长度
 *          注意：不要和数组的length搞混，数组的length是属性，而String的length()是方法
 *
 *      11、int lastIndexOf(String str)：
 *          返回指定子字符串在此字符串最后一次出现处的索引
 *
 *      12、String replace(char oldChar, char newChar)：
 *          将字符串中所有oldChar替换成newChar
 *
 *      13、String replace(CharSequence target, CharSequence replacement)：
 *          将字符串中的子字符串target替换成replacement
 *          注：若该字符串中没有子字符串target不会报错！
 *
 *      14、String[] split(String regex)：
 *          按照正则表达式regex作为分隔符进行拆分，返回拆分后的字符串数组
 *          注：regex也可以是字符/字符串
 *
 *      15、boolean startsWith(String prefix)：
 *          判断某个字符串是否以prefix子字符串开始
 *
 *      16、String substring(int beginIndex)：
 *          返回从下标beginIndex开始的子字符串
 *
 *      17、String substring(int beginIndex, int endIndex)：
 *          返回从下标beginIndex开始，到endIndex - 1截止的子字符串
 *          注：左闭右开
 *
 *      18、char[] toCharArray()：
 *          将字符串转换为字符数组
 *
 *      19、String toLowerCase()：
 *          将字符串中的所有字符转换为小写
 *
 *      20、String toUpperCase()：
 *          将字符串中的所有字符转换为大写
 *
 *      21、String trim()：
 *          去除字符串前后空白
 *
 *      22、static String valueOf(boolean b)：
 *          参数内可以是多样的数据类型，从char到Object，作用是把”非字符串“转换成”字符串“。
 *          事实上，println源代码就使用了valueOf()方法！
 *          注：如果参数是Object类型，则转换的”非字符串“是该Object类调用toString()
 *             后返回的。所以注意有无重写toString()方法
 */
public class StringTest04 {

    public static void main(String[] args) {
        // 1、char charAt(int index)
        char c = "中国人".charAt(1);
        System.out.println(c);          // 国

        // 2、int compareTo(String anotherString)
        System.out.println("中国人".compareTo("中国"));       // 1
        System.out.println("abcd".compareTo("abce"));       // -1
        System.out.println("abce".compareTo("abcd"));       // 1
        System.out.println("xyz".compareTo("zyx"));         // -2，只比对到第一个不同的字符

        // 3、boolean contains(CharSequence s)
        System.out.println("http://".contains("https:"));   // false
        System.out.println("java".contains("va"));          // true

        // 4、boolean endsWith(String suffix)
        System.out.println("1.txt".endsWith("txt"));        // true
        System.out.println("java".endsWith("av"));          // false

        // 5、boolean equals(Object anObject)
        System.out.println("user".equals("admin"));         // false
        System.out.println("user".equals("user"));          // true

        // 6、boolean equalsIgnoreCase(String anotherString)
        System.out.println("Abc".equalsIgnoreCase("ABC"));  // true

        // 7、byte[] getBytes()
        byte[] trans = "abc".getBytes();
        for (int i = 0; i < trans.length; i++)
            System.out.println(trans[i]);
        trans = "中国人".getBytes();
        for (int i = 0; i < trans.length; i++)
            System.out.println(trans[i]);

        // 8、int indexOf(String str)
        System.out.println("easterne".indexOf("er"));   // 4（下标）

        // 9、boolean isEmpty()
        System.out.println("123".isEmpty());        // false
        System.out.println("".isEmpty());           // true

        // 10、int length()
        System.out.println("123".length());         // 3

        // 11、int lastIndexOf(String str)
        System.out.println("javaseC#oraclephpjavapython".lastIndexOf("java"));  // 17

        // 13、String replace(CharSequence target, CharSequence replacement)
        String sx = "http://www.baidu.com".replace("http:", "https:");
        System.out.println(sx);     // https://www.baidu.com

        // 14、String[] split(String regex)
        String[] ymd = "2021-2-16".split("-");
        for (int i = 0; i < ymd.length; i++)
            System.out.println(ymd[i]);     // 2021\n2\n16\n

        // 15、boolean startsWith(String prefix)
        System.out.println(sx.startsWith("https"));     // true

        // 16、String substring(int beginIndex)
        System.out.println(sx.substring(8));    // www.baidu.com

        // 17、String substring(int beginIndex, int endIndex)
        System.out.println(sx.substring(8, 11));    // www（左闭右开）

        // 18、char[] toCharArray()
        char[] cs = "123".toCharArray();
        for (int i = 0; i < cs.length; i++)
            System.out.println(cs[i]);      // 1\n2\n3\n

        // 19、String toLowerCase()
        System.out.println("ABCd中国".toLowerCase()); // abcd中国

        // 20、String toUpperCase()
        System.out.println("abcd我是".toUpperCase()); // ABCD我是

        // 21、String trim()
        String s21 = " Hello World!\t";
        System.out.println(s21.trim());     // Hello World!

        // 22、static String valueOf(boolean b)
        String s22 = String.valueOf(true);
        System.out.println(s22);        // true（但是是字符串类型）
    }

}
