package 语言基础;

public class IfDome {
    public static void main(String args[]) {


        /*
            补充：任何复杂的程序逻辑都可以通过三种结构来实现
                顺序结构：从上往下逐行执行，每句必走
                分支结构：基于条件执行的语句，并非每句必走
                循环结构：
         */

        /*
            分支结构：
                if结构：1条路结构
                    1)语法：
                        if(boolean){
                            语句块
                        }
                     2)执行过程：
                        判断boolean的值：
                            若为true，则执行语句块（整个结束）
                            若为false，则直接结束
                if....else结构：2条路结构

                满500打8折--------if结构
                满500打8折，不满500打9折--------if.....else结构
         */

        //做软件先搭框架，后填内容

        //if结构的演示

//        int num = 5;
//        if (num % 2 == 0){
//            System.out.println(num + "是偶数");
//        }
//        System.out.println("继续执行......");


        double price = 600;//消费金额
        if (price >= 500) {
            price = price * 0.8;//打8折
        }
        System.out.println("最终结算金额为：" + price);


    }
}
