package com.easterne.javase.exception.homework;

/**
 * 测试类
 */
public class ArmyTest {

    public static void main(String[] args) {
        // 创建军队
        Army army = new Army(3);

        // 创建武器对象
        Helicopter h = new Helicopter();
        Tank t = new Tank();
        LaserGun lg = new LaserGun();
        Tank t2 = new Tank();

        // 将上述武器加入武器库
        try {
            army.addWeapon(h);
            army.addWeapon(t);
            army.addWeapon(lg);
            army.addWeapon(t2);
        } catch (FullWeaponsException e) {
            System.out.println(e.getMessage());
        }

        // 军械库移动！
        System.out.println("On the move:");
        army.moveAll();
        // 军械库火炮打击
        System.out.println("Fire:");
        army.allShoot();
    }

}
