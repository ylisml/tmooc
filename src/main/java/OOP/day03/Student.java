package OOP.day03;

//学生类
public class Student {
    /*
        this:
            指代当前对象，哪个对象调用方法哪哥对象就是当前对象
            只能用在方法中，方法中访问成员变量之前默认有个this.

        补充：Java规定成员变量和局部变量是可以同名的，使用的时候默认采用的是就近原则
             this.成员变量名-----------------访问成语变量
             若想访问成员变量，this不能省略

             this.方法名()------------------调用方法（一般不用）
             this()------------------------调用构造方法（一般不用）

             内存管理：由JVM来管理的
                堆：new出来的对象（包括成员变量）
                栈：局部变量（包括方法的参数）
                方法区：---------面向对象第五天讨论


             null只是相对于引用类型而言，它与基本类型没有关系
             null:表示空，没有指向对象，若引用的值为null则该引用不能进行任何操作，否则报NullPointerException异常

     */

    String name;            //成员变量（整个类中）
    int age;
    String address;

    Student() {
        this("无名氏", 1, "未知");
    }

    //给成员变量赋值
    Student(String name, int age, String address) {//局部变量（当前方法中）
        this.name = name;
        this.age = age;
        this.address = address;
    }


    void sayHi() {
        System.out.println("大家好，我叫" + name + ",今年" + age + "岁了，家住" + address);
    }
}
