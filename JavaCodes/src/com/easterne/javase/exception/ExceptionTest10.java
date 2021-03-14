package com.easterne.javase.exception;

public class ExceptionTest10 {

    public static void main(String[] args) {
        int result = m();
        System.out.println(result);     // 100
    }

    /**
     * java语法规则（以下规则是不能破坏的）：
     *      - 方法体中的代码必须遵循自上而下顺序依次逐行执行！
     *      - return语句一旦执行，整个方法必须结束！
     */
    public static int m() {
        int i = 100;
        try {
            return i;
        } finally {
            i++;
        }
    }

}

/*
对以上m()方法反编译如下：
public static int m() {
    int i = 100;
    int j = i;
    i++;        // i进行自加
    return j;   // 但是返回的是j
}
 */
