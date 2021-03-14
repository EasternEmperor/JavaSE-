package com.easterne.javase.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 1、向Map集合中存，以及从Map集合中取，都是先调用key的hashCode()方法，然后再调用equals()方法！
 *      equals()方法有可能调用，有可能不调用。
 *      对put(k, v)和get(k)来说，什么时候equals()方法不调用？
 *          k.hashCode()返回哈希值，哈希值经过哈希算法转换为数组下标，如果
 *          数组下标处未放置元素，则直接返回null，equals()不用调用
 *
 * 2、注意：equals()方法和hashCode()方法必须同时重写！
 * 并且对两个对象，如果equals()返回true，那么它们的hashCode()方法返回值一定相同！
 * （因为一定在数组的同一个下标处）
 *
 * 3、hashCode()方法和equals()方法都可以用IDEA工具直接生成
 *
 * 4、终极结论：
 *      放在HashMap集合key部分的、以及要存放在HashSet集合中的元素，一定要同时重写equals()和hashCode()方法！
 *
 * 5、对于哈希表数据结构来说：
 *      如果o1和o2的hash值相同，一定是放到同一个单向链表上
 *      当然如果o1和o2的hash值不同，但由于哈希算法执行结束之后转换的数组下标可能相同，此时会发生
 *      ”哈希碰撞“，也会放到同一个数组下标位置上，在单向链表的末尾添加
 */
public class HashMapTest02 {

    public static void main(String[] args) {

        Person p1 = new Person("zhangsan");
        Person p2 = new Person("zhangsan");

        // 重写equals()之前是false，重写之后是true
        System.out.println(p1.equals(p2));

        // 重写hashCode()之前两者不同，重写之后相同
        System.out.println("p1的hashCode是：" + p1.hashCode());
        System.out.println("p1的hashCode是：" + p2.hashCode());

        // 如果不重写equals()和hashCode()，那么p1和p2都可以放进HashSet中
        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        System.out.println("personSet中的元素个数：" + personSet.size());  // 2

        // 重写之后p2会覆盖p1
        Set<Person> personSet2 = new HashSet<>();
        personSet2.add(p1);
        personSet2.add(p2);
        System.out.println("personSet中的元素个数：" + personSet2.size());  // 1

    }

}

class Person {
    private String name;

    // 构造函数
    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    // setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // equals()
    // 自己重写equals()方法
/*
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Person)) return false;
        if (o == this)  return true;
        Person person = (Person)o;
        return this.name.equals(person.name);
    }
    */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    //hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
