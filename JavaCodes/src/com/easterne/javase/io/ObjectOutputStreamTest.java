package com.easterne.javase.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 1、序列化和反序列化：
 *      将Java对象存储到硬盘上称为序列化，将存储在硬盘上的Java对象取到内存中称为反序列化
 *
 * 2、java.io.NotSerializableException：
 *      该异常表示对象不支持序列化！
 *
 * 3、参与序列化和反序列化的对象，必须实现Serializable接口
 *
 * 4、注意：通过源代码发现，Serializable接口只是一个标志接口：
 *      public interface Serializable {
 *      }
 *      这个接口当中什么代码都没有
 *      如何起作用呢？
 *          起到标识的作用，标志的作用，java虚拟机看到这个类实现了这个接口，可能会对这个类进行特殊待遇
 *          Serializable这个标志接口是给java虚拟机参考的，Java虚拟机看到这个接口后，会为该类自动生
 *          成一个版本序列号
 *
 * 5、序列化版本号的作用？
 *      Java语言是通过什么机制来区分类的？
 *          - 首先通过类名进行对比
 *          - 如果类名相同，再通过序列化版本号进行区分
 *
 *      自动生成序列化版本号
 *          - 优点：可以区分两个类名一致的类对象。并且即使是同一个类，修改前和修改后的
 *                 序列化版本号也不一样，所以会区分开。
 *          - 缺陷：一旦代码确定后，便不能进行修改。
 *
 */
public class ObjectOutputStreamTest {

    public static void main(String[] args) throws IOException {
        // 创建java对象
        Student s = new Student(110, "zhangsan");
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        // 序列化对象
        oos.writeObject(s);

        // 刷新输出流
        oos.flush();
        // 关闭流
        oos.close();

    }

}

class Student implements Serializable {
    // Java虚拟机看到Serializable接口后，会自动生成一个序列化版本号
    // 这里没有手动写出来，java虚拟机会默认提供这个序列化版本号
    // 建议将序列化版本号手动地写出来，不建议自动生成！
    // Java虚拟机识别一个类时，先通过类名，再通过序列化版本号
    private static final long serialVersionUID = 1L;

    private int no;
    // 用transient修饰的变量不参与序列化！
    private transient String name;

    // 如果对这个类进行修改，再编译之后，生成了全新的字节码
    // Java虚拟机会认为该类为全新的类，会重新提供一个新的序列化版本号
    private String address;
    private int age;

    public Student() {
    }

    public Student(int no, String name, String address, int age) {
        this.no = no;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }


    // setter getter

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
