package com.easterne.javase.thread.threadsafe;

/**
 * 总结：
 * synchronized有三种用法：
 *      1、同步代码块：灵活
 *          synchronized(线程共享对象) {
 *              同步代码块;
 *          }
 *
 *      2、在实例方法上使用synchronized修饰：
 *          表示共享对象一定是this
 *          并且同步代码块是整个方法体
 *
 *      3、在静态方法上使用synchronized：
 *          表示类锁
 *          注意：对于一个类，类锁永远只有一把
 *               就算创建了100个对象，类锁也只有一把
 *
 *          对象锁：1个对象1把锁，100个对象100把锁
 *          类锁：100个对象，也可能只是1把类锁
 */
public class Summary {
}
