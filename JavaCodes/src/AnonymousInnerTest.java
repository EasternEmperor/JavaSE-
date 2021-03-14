
/**
 * 匿名内部类是局部内部类的一种。由于该类没有名字而得名
 */
public class AnonymousInnerTest {

    public static void main(String[] args) {

        MyMath mm = new MyMath();
        // 这里使用匿名内部类，重写了sum方法，但是无法重用代码
        mm.calculate(new Compute() {
            public int sum(int a, int b) {
                return a + b;
            }
        }, 100, 200);

    }

}

// 负责计算的接口
interface Compute {
    // 抽象方法
    int sum(int a, int b);
}

class MyMath {
    // 注意多态
    public void calculate(Compute c, int a, int b) {
        int x = c.sum(a, b);
        System.out.println(a + "+" + b + "=" + x);
    }
}

