/**
 * 匿名内部类：
 *      1、什么是内部类？
 *          在类的内部又定义了一个新的类，被称为内部类
 *
 *      2、内部类的分类：
 *          静态内部类：类似于静态变量
 *          实例内部类：类似于实例变量
 *          局部内部类：类似于局部变量
 *
 *      3、使用内部类编写的代码，可读性很差，能不用尽量不用
 *
 *      4、匿名内部类是局部内部类的一种。由于该类没有名字而得名
 */
public class InnerClass {

    // 静态
    static String country;
    static class Inner1 {}

    // 实例
    int age;
    class Inner2 {}

    // 局部
    public void doSome() {
        // 局部变量
        int i = 10;
        class Inner3 {}
    }
    public void doOther() {
        // doSome()方法中的局部内部类Inner3，在doOther()中不能用
    }

}
