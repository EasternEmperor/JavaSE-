package com.easterne.javase.collection;

/**
 * 自定义泛型
 *      自定义泛型时，<>尖括号中的是一个标识符，可以随便写
 *      java源代码中经常出现的是：
 *          <E>和<T>
 *      E：Element
 *      T：Type
 *
 */
public class GenericTest03<标识符随便写> {

    public static void main(String[] args) {

        GenericTest03<String> gt = new GenericTest03<>();
        gt.doSome("123");       // 此处参数只能为String型
        // 类型不匹配
        //gt.doSome(123);

    }

    public void doSome(标识符随便写 o) {
        System.out.println(o);
    }

}
