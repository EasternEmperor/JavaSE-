package com.easterne.javase.exception.homework;

/**
 * 激光枪：只可攻击，不可移动
 */
public class LaserGun extends Weapon implements Shootable {

    @Override
    public void shoot() {
        System.out.println("激光枪发射！");
    }

    @Override
    public String toString() {
        return "LaserGun: Added to the arsenal";
    }
}
