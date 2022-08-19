package 语言基础;

public class OperDemo {
    public static void main(String args[]){
//        int a = 1;
//        int b = 1;
//        System.out.println(a++);
//        System.out.println(++b);
//        int c = a++;
//        int d = ++b;
//        System.out.println(c);
//        System.out.println(d);
//        int e = 4 ;
//        int f = 4;
//        int g = e--;
//        int h = --f;
//        System.out.println(e);//3
//        System.out.println(f);//3
//        System.out.println(g);//4
//        System.out.println(h);//3
//            int a = 5;
//            int b = 5;
//            int c = a--;
//            int d = --b;
//            System.out.println(a);//4
//            System.out.println(b);//4
//            System.out.println(c);//5
//            System.out.println(d);//4

        /*
        关系运算符
         */

//        int a= 5,b = 10,c = 5;
//        System.out.println(a++ >= b);//false -----a自增1变为6
//        System.out.println(a++ > c);//true -------a自增1变为7
//        System.out.println(a++ < b);//true -------a自增1变为8
//        System.out.println(b++ > a++);//true -----b自增1变为11，a自增1变为9


        /*
        逻辑运算符
        &&：逻辑（短路）与（并且）
        ||:逻辑（短路）或（或者）
         !:逻辑非（取反）
         逻辑运算是建立在关系运算的基础上
         逻辑运算的结果也是boolean型
         */

//        int a =5,b = 10,c = 5;
//
//        boolean b1 = a<b || c++>2;
//        System.out.println(b1);//true
//        System.out.println(c);//5,发生了短路

//        boolean b1 = a>b && c++>2;
//        System.out.println(b1);//false
//        System.out.println(c);//5，发生了短路

        /*
        位运算符
        &:不短路与
        |:不短路或
         */


        //非的优先级最高
//        boolean b2 = !(a>b);
//        System.out.println(b2);//true

//        System.out.println(b>=a || b<=c);//true
//        System.out.println(b<=c || b>a);//true
//        System.out.println(b!=c || a<b);//true
//        System.out.println(a==b || c>b);//false


//        boolean b1 = b>=a && b<c;//false
//        System.out.println(b1);
//        System.out.println(b<=c && b>a);//false
//        System.out.println(a==b && c>b);//false
//        System.out.println(b!=c && a<b);//true


        /*
        赋值运算符：
            简单赋值运算符：=
            扩展赋值运算符：+=、-=、*=、/=、%=
                -------扩展运算符自带强制转换
         */

//        int a = 5;
//        a += 2;
//        System.out.println(a);
//
//        //小面试题：
//        short s = 5;
//        s = s + 10;//编译错误，需强制转化：s = (short)(s + 10)
//        s += 10;


        /*
        字符串连接运算符：
            +：
                1）若两边位数字，则做加法运算符
                2）若两边出现了字符串，则做字符串连接
                    注意：任何类型的数据只要和字符串连，结果都会变为字符串类型---同化作用
         */
//        int age = 38;
//        System.out.println("age=");//age
//        System.out.println(age);//38
//        System.out.println("age=" + age);//age = 38
//        System.out.println("我的年龄是"+age);//我的年龄是38
//        System.out.println("我今年"+age+"岁了");//我今年38岁了
//
//        String name = "WKJ";
//        System.out.println("name=" + name);//name = WKJ
//        System.out.println("大家好，我叫" + name);//大家好，我叫WKG
//        System.out.println("大家好，我叫" + name +"今年" + age +"岁了");//大家好，我叫WKJ今年38岁了
//
//
//        System.out.println(10+20+""+30);//3030 ------String
//        System.out.println("" + 10 + 20 + 30);//102030 -----String
//        System.out.println(10 + 20 + 30 + "");//60 -----String


        /*
        条件/三目运算符：
            1）语法：
                boolean？数1：数2
            2）执行过程：
                整个条件运算是有值的，他的值要么是问号后的数1，要么是冒号后的数2
                判断boolean的值：
                    若为true，则整个表达式的结果为？号后的数1
                    若为false，则整个表达式的结果为：号后的数2
         */
        int num = 0;
        int flag = num > 0 ? 1: -1;
        System.out.println(flag);//-1

        int a = 8,b = 55;
        int max = a>b?a:b;
        System.out.println("MAX="+max);//MAX=55

    }
}
