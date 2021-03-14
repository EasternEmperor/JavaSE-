
/**
 * 一个类可以同时继承类和同时实现接口（同时也可以实现多个接口）
 * 此时关键词顺序：extends在前，implements在后
 */
public class InterfaceTest03 {

    public static void main(String[] args) {

        // 利用多态
        Wing cat = new Cat();
        cat.fly();
        // 接口间的强转
        Mouth cat2 = (Mouth)cat;
        cat2.eat();

    }

}

// 接口：翅膀
// 实现该接口的类便可以飞
interface Wing {
    void fly();     // 注意：默认是public权限
}
// 接口：嘴巴
// 实现该接口的类便可以吃
interface Mouth {
    void eat();     // 注意：默认是public权限
}

class Animal {

}

class Cat extends Animal implements Wing, Mouth {
    // 重写的方法：权限只能更高，不能更低！
    public void fly() {
        System.out.println("我是一只飞猫，我是自由的！");
    }
    public void eat() {
        System.out.println("我喜欢吃🐟");
    }
}


