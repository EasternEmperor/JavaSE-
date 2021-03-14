
/**
 *  抽象类：
 *      1、什么是抽象类？
 *          类和类之间具有的共同特征，将这些共同特征提取出来，就形成了抽象类
 *
 *      2、抽象类属于什么类型？
 *          抽象类也属于引用数据类型
 *
 *      3、抽象类怎么定义？
 *          语法：
 *              [修饰符列表] abstract class 类名 {
 *                  类体;
 *              }
 *
 *      4、抽象类无法实例化，无法创建对象，所以抽象类是用来被子类继承的
 *
 *      5、abstract和final不能组合使用
 *
 *      6、抽象类的子类也可以是抽象类
 *
 *      7、抽象类虽然无法实例化，但抽象类有构造方法（供子类使用的，配合super()）
 *
 *      8、抽象类关联到抽象方法概念。那么什么是抽象方法呢？
 *          抽象方法表示没有实现的方法，没有方法体的方法。例如：
 *              public abtract void doSome();
 *          抽象方法的特点：
 *              特点1：没有方法体，以分号结尾
 *              特点2：前面的修饰符列表中有abstract
 *          注意：如果抽象类中有抽象方法，那么子类中一定要重写该抽象方法！
 *
 *      9、抽象类可以没有抽象方法，但抽象方法一定出现在抽象类中
 *
 *      10、Java中，并不是只有抽象方法才没有方法体，例外的是：Java中有一些调用底层实现C++的方法，也没有方法体
 */
public class AbstractTest {

    public static void main(String[] args) {

        // 多态！向上转型
        Account ca = new CreditAccount();
        ca.doSome();

    }

}

abstract class Account {

    abstract void doSome();
}

class CreditAccount extends Account {

    void doSome() {
        System.out.println("do some");
    }
}
