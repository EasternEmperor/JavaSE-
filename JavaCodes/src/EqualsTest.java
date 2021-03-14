
/**
 * 关于Object类中的equals方法：
 *      1、equals方法的源代码
 *          public boolean equals(Object obj) {
 *              return (this == obj);
 *          }
 *          以上这个方法是Object类的默认实现
 *      2、equals方法的作用：
 *          判断两个对象是否相等，但使用的"=="，不够用
 *      3、判断两个java对象是否相等，不能用"=="，因为"=="比较的是两个对象的内存地址
 *      4、所以我们可以在类中重写equals方法，来使它可以判断两个java对象是否相等（类名、内容）
 *
 * IDEA中可以直接生成对应的equals和toString方法！！！
 *
 * Java中所有引用数据类型统一使用equals方法来判断是否相等！！！
 * 这里注意：String也是引用数据类型，不能用"=="来判断是否相等，要用equals！！！
 */
public class EqualsTest {

    public static void main(String[] args) {

        // 创建两个Time对象，并且其中实例变量相等
        Time t1 = new Time(2008, 8, 8);
        Time t2 = new Time(2008, 8, 8);

        System.out.println("使用\"==\"：" + (t1 == t2));
        System.out.println("使用重写后的equals：" + t1.equals(t2));

    }

}

class Time {
    private int year;
    private int month;
    private int day;

    public Time() {
    }

    public Time(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // 以下程序效率较低，可以提升其效率！！！
/*    public boolean equals(Object obj) {
        // 由于传入的是Object类型，要将其向下转型为当前类（如果可以的话）
        if (obj instanceof Time) {
            Time t = (Time)obj;

            // 接下来判断其中的实例变量是否相等
            if (t.getDay() == this.day && t.getMonth() == this.month
                    && t.getYear() == this.year)
                return true;
        }

        return false;
    }*/

    // 改良equals
    public boolean equals(Object obj) {
        // 先考虑特殊情况
        // 空指针或类不相同
        if (obj == null || !(obj instanceof Time))
            return false;
        // 根本就是同一个引用
        if (obj == this)
            return true;
        // 再进行判断
        Time t = (Time)obj;
        return t.getDay() == this.day && t.getMonth() == this.month
                && t.getYear() == this.year;
    }


}
