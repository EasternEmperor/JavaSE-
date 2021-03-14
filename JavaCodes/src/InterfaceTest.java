
/**
 * 接口：
 *      1、接口也是一种引用数据类型
 *      2、接口是完全抽象的（抽象类是半抽象），或者也可以说接口是特殊的抽象类
 *      3、定义接口的语法：
 *          [修饰符列表] interface 接口名 {}
 *      4、接口支持多继承，即一个接口可以继承多个接口
 *      5、接口中只包含两部分内容：
 *          - 常量
 *          - 抽象方法
 *      6、接口中所有元素都是以public修饰的（都是公开的）
 *      7、接口中的抽象方法定义时：
 *          public abstract修饰符可以省略
 *      9、接口中的常量声明时：
 *          public static final修饰符也可以省略
 *      8、接口中的方法都是抽象方法，所以都没有方法体
 *
 * 接口的基础语法：
 *      1、类和类之间叫“继承”，类和接口之间叫“实现”
 *      继承使用extends，实现使用implements
 *      2、当一个非抽象类实现接口时，必须将接口中的所有抽象方法实现
 *      4、一个类可以同时实现多个接口。这种机制弥补了Java中的单继承缺陷
 *      5、类可以同时extends 类和implements 接口，注意extends在前、implements在后
 *      6、使用接口，写代码的时候，可以使用多态（父类型引用指向子类型对象）
 *
 * 接口在开发中的作用：
 *      接口是完全抽象的，而我们正好要求：面向抽象编程
 *      面向抽象编程 == 面向接口编程！
 *
 * 接口和抽象类的区别：
 *      1、抽象类是半抽象的
 *         接口是完全抽象的
 *      2、抽象类中有构造方法
 *         接口中没有构造方法
 *      3、接口和接口之间支持多继承
 *         类和类之间只能单继承
 *      4、一个类可以同时实现多个接口
 *         一个抽象类只能继承一个类（单继承）
 *      5、接口中只允许出现常量和抽象方法
 */
public class InterfaceTest {

    public static void main(String[] args) {

        System.out.println(B.PI);

        // 多态：C是接口，D是实现C的类
        B D = new D();
        D.sub(10, 3);
    }

}

// 接口定义
interface A {
}

interface B {
    public static final double PI = 3.14;
    void sum(int a, int b);
    void sub(int a, int b);
}

interface C extends A, B {
}

// 类继承接口叫做“实现”，类实现接口使用关键字implements
// 如果不是抽象类实现接口，那么一定要重写接口中的抽象方法！！！
class D implements B, A {       // 支持多实现

    public void sum(int a, int b) {
        System.out.println(a + "+" + b + "=" + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println(a + "-" + b + "=" + (a - b));
    }
}


