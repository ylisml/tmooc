package OOP.day03;

import OOP.day03.Student;

/**
 * 引用类型数组
 */
public class RefArrayDemo {
    public static void main(String[] args) {
        /**
         * 基本类型数组
         *
         * 引用类型数组
         *      给元素赋值时，需要new个对象
         *      若想访问对象的数据，需要通过数组元素去打点来访问
         *
         */
        Student[] stus = new Student[3];
        stus[0] = new Student("张三", 25, "廊坊");
        stus[1] = new Student("李四", 34, "呼和浩特");
        stus[2] = new Student("杨六", 20, "万锦·创客星空");

        for (Student a : stus) {
            System.out.println(a.name + ":");
            a.sayHi();
        }

    }
}
/**
 * 继承：
 *   作用：代码的复用
 *   通过extends来继承
 *   超类/父类：共有的属性和行为
 *   派生类/子类/；特有的属性和行为
 *   派生类可以访问派生类的+超类的，但超类不能访问派生类
 *   一个类可以有多个派生类，但一个派生类只能继承一个超类--------单一继承
 *   继承具有传递性
 *Java规定：构造派生类之前必须构造派生类
 *    在派生类的构造方法中若没有调用超类的构造方法则默认调用超类的构造方法
 *super:
 *   指代当前对象的超类对象
 *   super的用法：
 *      super.成员变量名-----------访问超类的成员变量
 *      super.方法名--------------调用超类的方法
 *      super()------------------调用超类的构造方法
 */