package 语言基础;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {

        /*
            方法：函数（C）、过程（VB）
                封装一段特定的业务逻辑功能
                方法要尽可能独立，一个方法只干一件事
                一个方法可以被多次反复调用
                方法可以减少代码的重复，有利于代码的维护
                方法的定义：
                    五要素
                        修饰词 返回值类型   方法名(参数列表){
                                方法体
                        }
                     方法可以有返回值，也可以无返回值
                        无返回值-------------返回值类型统一写成void
                        有返回值-------------返回值类型设计为特定的数据类型即可
                        何时有返回值？何时无返回值？
                            当方法执行完后：
                                若不需要用到方法中的数据----------无返回值
                                若需要用到方法中的数据------------有返回值
                方法的调用：
                    无返回值：方法名（有参传参）
                    有返回值：数据类型 变量 = 方法名（有参传参）；
                return：
                    return 值；//1）结束方法的执行 2）返回结果给调用方----------此方式是用在有返回值的方法中
                    return；//1）结束方法的执行------------------------------此方式用在无返回值的方法中

             补充：
                形参：定义时的参数
                实参：调用时的参数
         */
        say();//调用say()方法
        sayHi("hello");
        sayHello("张三",18);
        double a = getNum();
        System.out.println(a);
        int a1 = 55,b1 = 54;
        int c = plus(a1,b1);
        System.out.println(c);
        int[] d = testArray();
        System.out.println("长度为：" + d.length);
        d = Arrays.copyOf(d,d.length+1);
        System.out.println("扩容后的长度为：" + d.length);
        System.out.println(d[6]);
        System.out.println("继续执行.....");

        a();
        System.out.println(444);
    }

    //方法的嵌套
    public static void a(){
        System.out.println(111);
        b();
        System.out.println(222);
    }

    public static void b(){
        System.out.println(333);
    }







    public static int[] testArray(){
        int[] arr = new int[10];
        for (int i = 0 ; i < arr.length;i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }




    //有参有返回值
    public static int plus(int num1,int num2){
        int num = num1 + num2;
        return num;
    }

    //无参有返回值
    public static double getNum(){
        /*
            java规定：
                1）有返回值的方法中，必须的通过return来返回数据
                1）并且return后的数据类型必须与返回值类型匹配
         */
        return 8.88;//1)结束方法的执行 2）返回结果给调用方
    }


    //有参无返回值
    public static void sayHi(String name) {
        System.out.println("大家好，我叫" + name + "今年38岁了");
    }

    public static void sayHello(String name,int age){
        if (age >= 20)
            return;//结束方法
        System.out.println("大家好，我叫"+name+"今年"+age+"岁了");
    }

    //无参无返回值
    public static void say() {

        System.out.println("大家好，我叫WKJ，今年38岁了");

    }




}
