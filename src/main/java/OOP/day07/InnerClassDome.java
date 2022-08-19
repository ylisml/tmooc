package OOP.day07;

public class InnerClassDome {
    public static void main(String[] args) {
        Aoo o1 = new Aoo() {
            /**
             * 1）系统自动创建了一个派生类，但是没有名字
             * 2）为该派生类创建了一个对象，名为o1
             *      --------new Aoo(){};是在创建Aoo的派生类的对象
             * 3）
             */
        };
    }
}

abstract class Aoo{}

/**
 * 匿名内部类：
 *      若想创建一个对象，并且对象只创建一次，可以设计为匿名内部类
 */