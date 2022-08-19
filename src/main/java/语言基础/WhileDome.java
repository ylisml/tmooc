package 语言基础;

public class WhileDome {
    //while结构演示
    public static void main(String args[]) {
         /*
            循环:反复多次执行一段相同代码
            循环三要素：
                循环变量初始化
                循环的条件（以循环变量为基础）
                循环变量的改变（向着循环的结束变）

                循环变量：在整个循环中所反复改变的那个数
         */

        /*
            while结构：
                语法：
                    while(boolean){
                        语句块/循环体--------反复干的事
                    }
                 执行过程：
                    判断boolean的值，若为true则执行语句块，
                    再判断boolean的值，若为true则执行语句块，
                    再判断boolean的值，若为true则执行语句块，
                    如此反复，直到boolean的值为false时，while循环结束
         */
        //输出5次"行动是成功的阶梯"
        int num = 0;//循环变量初始化
        while (num < 5) {//循环变量的条件
            System.out.println("行动是成功的阶梯");
            num++;//循环变量的改变
        }
        /*
            执行过程：
                num等于0，条件为true输出"行动是成功的阶梯"，
                num等于1，条件为true输出"行动是成功的阶梯"，
                num等于2，条件为true输出"行动是成功的阶梯"，
                num等于3，条件为true输出"行动是成功的阶梯"，
                num等于5，条件为true输出"行动是成功的阶梯"，
                num等于6，条件为false，while循环结束
         */
        //输出9的乘法表
        int num2 = 1;
        while(num2 <= 9){
            System.out.println(num2 + "* 9 =" + num2*9);
            num2+=1;
        }
        /*
            num等于1条件为true输出1* 9 =9，
            num等于2条件为true输出2* 9 =18，
            num等于3条件为true输出3* 9 =27，
            num等于4条件为true输出4* 9 =36，
            num等于5条件为true输出5* 9 =45，
            num等于6条件为true输出6* 9 =54，
            num等于7条件为true输出7* 9 =63，
            num等于8条件为true输出8* 9 =72，
            num等于9条件为true输出9* 9 =81，
            num等于10条件为false，while循环结束
         */

    }
}
