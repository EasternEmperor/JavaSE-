package com.easterne.javase.exception.homework;

/**
 * 坦克：既可移动、又可攻击
 */
public class Tank extends Weapon implements Shootable, Movable{

    @Override
    public void move() {
        System.out.println("坦克平推！");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮！");
    }

    @Override
    public String toString() {
        return "Tank: Added to the arsenal";
    }
}
