package 语言基础;

public class IfElseDome {
    public static void main(String args[]) {
        //if....else结构演示
        /*
            if...else结构：2条路
                1）语法：
                    if(boolean){
                        语句块1
                    }else{
                        语句块2
                    }
                2)执行过程：
                    判断boolean的值：
                        若为true，则执行语句块1（整个结束）
                        若为false，则执行语句块2（整个结束）
                3）说明：
                    语句块1和语句块2，有可能同时执行吗？------不可能同时执行
                    语句块1和语句块2，有可能同时不执行吗？-----不可能同时不执行
                    语句块1和语句块2，必走其中之一-------2选1
         */

        //偶数奇数的判断
        int num = 6;
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
        System.out.println("继续执行......");
        //满500打8折，不满500打9折
        double price = 300;//消费金额
        if (price >= 500) {
            price = price * 0.8;//打8折
        } else {
            price = price * 0.9;//打9折
        }
        System.out.println("最终结算金额为" + price);


        /*
            给变量赋值：
                1、赋一个固定的值
                    int a = b + 10;
                2、接收用户输入的值------------Scanner
                    int a = ?;
                3、系统随机生成的值
                    int a = ?;
         */


    }
}
