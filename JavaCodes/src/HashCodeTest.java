
/**
 * hashCode方法：
 *      在Object中的hashCode方法是怎样的？
 *          public native int hashCode();
 *
 *          这个方法不是抽象方法，带有native关键字，底层调用C++
 *
 *      hashCode()方法返回的是哈希码：
 *          实际上就是一个java对象的内存地址，经过哈希算法得出的一个值。
 *          所以hashCode()方法的执行结果可以等同看作一个java对象的内存地址
 */
public class HashCodeTest {

    public static void main(String[] args) {

        Object o = new Object();
        int hashCodeValue1 = o.hashCode();
        System.out.println("o哈希算法转换后的内存地址：" + hashCodeValue1);

        My m =  new My();
        int hashCodeValue2 = m.hashCode();
        System.out.println("m哈希算法转换后的内存地址：" + hashCodeValue2);

    }

}

class My {

}
