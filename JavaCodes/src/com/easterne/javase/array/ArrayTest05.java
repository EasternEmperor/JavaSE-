package com.easterne.javase.array;

/**
 * 数组存储引用数据类型
 */
public class ArrayTest05 {

    public static void main(String[] args) {
        // 创建Animal类型的数组
        Animal[] animals = {new Animal(), new Animal()};

        // 对Animals遍历
        for (int i = 0; i < animals.length; i++)
            animals[i].move();

        // 利用多态的数组
        Animal[] phy = {new Cat(), new Bird()};
        // 对phy遍历，调用move
        for (int i = 0; i < phy.length; i++)
            // 如果调用的方法是重写的父类Animal的方法，那么不用向下转型，可以直接调用
            phy[i].move();
        // 对phy遍历，调用子类中特有的方法
        for (int i = 0; i < phy.length; i++)
            // 需要向下转型
            if (phy[i] instanceof Cat) {
                Cat c = (Cat)phy[i];
                c.catchMouse();
            }
            else if (phy[i] instanceof Bird){
                Bird b = (Bird)phy[i];
                b.sing();
            }
    }

}

class Animal {
    public void move() {
        System.out.println("Animal move...");
    }
}

class Cat extends Animal{
    public void move() {
        System.out.println("Cat move...");
    }
    public void catchMouse() {
        System.out.println("Cat catches mice...");
    }
}

class Bird extends Animal {
    public void move() {
        System.out.println("Bird fly...");
    }
    public void sing() {
        System.out.println("Bird sings...");
    }
}
