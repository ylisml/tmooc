package OOP.day10;
/**String的演示*/
public class StringDome {
    public static void main(String[] args) {
        /**
         * 使用字面量来创建字符串对象时，JVM会检查常量池中是否有该对象：
         * 1）若没有，则会创建该字符串对象，并存入常量池中
         * 2）若有，则直接将常量池中的对象（引用）返回------并不会创建新的字符串对象
         */

        String s1 = "123abc";//常量池还没有，因此创建该字符串对象，并存入常量池
    }
}
