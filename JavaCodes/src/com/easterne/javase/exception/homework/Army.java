package com.easterne.javase.exception.homework;

/**
 * 军队类：内含武器数组，addWeapon()方法、moveAll()方法、allShoot()方法
 * addWeapon()方法要注意在武器库满之后抛出异常
 *
 * 类在转成接口时，即使不存在实现关系也可以转，只要该引用指向的堆内存中的对象是实现了该接口即可！
 */
public class Army {
    private Weapon[] weapons;
    private int num;        // 武器库中武器数量

    // 有参构造方法
    public Army(int upper) {
        weapons = new Weapon[upper];    // 动态初始化，容量为upper
        this.num = 0;       // 初始武器数为0
    }

    /**
     * 向Army中加入武器
     * @param weapon：武器对象
     * @throws FullWeaponsException：抛出的异常
     */
    public void addWeapon(Weapon weapon) throws FullWeaponsException{
        // 武器库满了则抛出异常
        if (num == weapons.length) {
            throw new FullWeaponsException("武器库已经满了，无法新增武器！");
        }
        // 否则加入武器
        weapons[num++] = weapon;
        System.out.println(weapon);
    }

    /**
     * 使所有能移动的武器移动
     */
    public void moveAll() {
        for(int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Movable) {
                // 注意：由于Weapon类中其实没有move()方法，所以要将其强转为Movable后再调用move()方法
                ((Movable) weapons[i]).move();
            }
        }
    }

    /**
     * 使所有能攻击的武器攻击
     */
    public void allShoot() {
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Shootable) {
                // 强转
                ((Shootable) weapons[i]).shoot();
            }
        }
    }

}
