package OOP.day01;
 /*
        OO：面向对象
        OOA：面向对象分析
        OOD：面向对象设计
        OOP：面向对象编程



        高质量代码：
            复用性好、扩展性好、维护性好、移植性好、健壮性好、可读性好、效率好

        类：是一种引用数据类型,是我们自己所创造的一种引用类型

        软件来源于生活


        什么是类？什么是对象？
            现实生活中是由很多很多对象组成
            对象：软件中真实存在的单个个体/东西
            类：类型/类别，代表一类个体
        如何创建类？如何创建对象？如何访问成员？

        方法的签名：方法名+参数列表
        方法的重载(overload/overloading)：
            发生在同一类中，方法名相同，参数不同
     */

public class Student {
    //成员变量 -----对象的属性
    String name;
    int age;
    String address;

    //方法------对象的行为/功能
    void study() {
        System.out.println(name + "在学习.....");
    }

    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，家住" + address);
    }


}
