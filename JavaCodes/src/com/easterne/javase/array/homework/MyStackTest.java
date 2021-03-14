package com.easterne.javase.array.homework;

/**
 * 模拟栈：
 *      push和pop
 */
public class MyStackTest {

    public static void main(String[] args) {
        // 初始化
        MyStack ms = new MyStack();             // 空参构造
        MyStack ms2 = new MyStack(100);  // 传入栈长度构造

        // 测试push方法
        for (int i = 0; i < 101; i++) {
            String s = i + "";
            ms.push(s);
            ms2.push(s);
        }
        // 测试pop方法
        // ms
        int length = ms.getStack();
        for (int i = length; i >= 0; i--)
            ms.pop();
        // ms2
        int length2 = ms2.getStack();
        for (int i = length2; i >= 0; i--)
            ms2.pop();
    }

}


class MyStack {
    private Object[] stack;
    int length;             // 栈长
    int stackFrame;         // 栈帧：指向栈顶

    // 构造方法
    public MyStack() {
        this.stack = new Object[100];
        this.length = 100;      // 默认栈大小：100
        this.stackFrame = 0;    // 初始化，栈帧为0
    }

    public MyStack(int length) {
        this.stack = new Object[length];    // 声明数组
        this.stackFrame = 0;                // 初始化，栈帧为0
        this.length = length;               // 栈长度
    }

    // getter：返回栈长
    public int getStack() {
        return this.stackFrame;
    }

    // push方法：压栈
    public void push(Object object) {
        // 如果越界了，则push失败，并警告
        if (this.stackFrame == length) {
            System.out.println("栈已满，push失败！");
            return ;
        }
        // 未越界则加入
        stack[this.stackFrame++] = object;
    }


    // pop方法：弹栈
    public Object pop() {
        // 如果栈为空，则弹出失败，并警告
        if (this.stackFrame == 0) {
            System.out.println("栈空，pop失败！");
            return null;
        }
        // 栈不为空，则弹出栈顶元素
        this.stackFrame--;      // 栈帧减1即可
        System.out.println(stack[this.stackFrame]);
        return stack[this.stackFrame];
    }
}
