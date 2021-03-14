/**
 *  接口和接口之间在进行强制类型转换时，没有继承关系也可以强转。
 *  但是注意，需要创建对象的时使用的类均实现了要进行强转的那两个接口，否则会出现ClassCastException问题
 *
 *  如下例：
 *      类I实现了M和K，所以能将向上转型m对象可以向下转型为K接口的对象k
 *      还是记住在强转之前，使用instanceof判断
 */
public class InterfaceTest02 {

    public static void main(String[] args) {

        // 多态，向上转型
        M m = new I();
        // 经过测试：接口和接口之间在进行强制类型转换时，没有继承关系也可以强转
        // 但是有可能会出现ClassCastException问题
        K k = (K) m;
        k.printK();     // 此时强转后的k引用可以调用K接口中的printK方法（运行时仍然调用I重写的方法）

    }

}

interface K {
    void printK();
}

interface M {
    void printM();
}

class I implements K, M {

    public void printK() {
        System.out.println("K starts");
    }

    public void printM() {
        System.out.println("M ends");
    }
}
