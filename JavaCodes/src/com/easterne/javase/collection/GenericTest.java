package com.easterne.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 泛型机制的使用：
 *      1、泛型语法机制只在编译期起作用（运行期不起作用）
 *
 *      2、使用泛型的好处？
 *          - 集合中存储的元素类型统一了
 *          - 从集合中取出的元素类型是泛型指定的类型，不需要进行大量的”强转“！
 *
 *      3、使用泛型的缺点？
 *          导致集合中存储的元素单一，缺乏多样性
 *          大多数业务中，集合中元素的类型还是统一的。所以泛型被认可
 */
public class GenericTest {

    public static void main(String[] args) {
        // 如何判断泛型是否能使用：有<E>标识
        // 以下表示：该ArrayList中只能存储Animal类型的数据
        List<Animal> list = new ArrayList<Animal>();

        // 加入元素
        Animal a1 = new Cat();
        Animal a2 = new Bird();
        list.add(a1);
        list.add(a2);

        // 以下报错：因为"Hello"是String类型，不是Animal类型！
        //list.add("Hello");

        // Iterator也使用泛型
        // 让动物移动
        /** 在调用Animal类中的方法时，泛型会简单其中步骤
         * 而若要调用Cat或Bird类中特有方法时，避免不了强转
         */
        Iterator<Animal> it = list.iterator();
        while (it.hasNext()) {
            // 在不使用泛型时，it.next()返回的是Object类型
            // 使用泛型后，it.next()返回的是Animal类型，可以直接赋给Animal对象，而不用强转
            Animal a = it.next();
            a.move();
        }
    }

}

class Animal {
    public void move() {
        System.out.println("Animal moves!");
    }
}

class Cat extends Animal {
    public void catchMouse() {
        System.out.println("Cat catches mice!");
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println("Bird flies!");
    }
}


