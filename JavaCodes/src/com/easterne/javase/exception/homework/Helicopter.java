package com.easterne.javase.exception.homework;

/**
 * 直升机：只能移动
 */
public class Helicopter extends Weapon implements Movable {
    @Override
    public void move() {
        System.out.println("直升机起飞~");
    }

    // 重写toString()方法

    @Override
    public String toString() {
        return "Helicopter: Added to the arsenal";
    }
}
