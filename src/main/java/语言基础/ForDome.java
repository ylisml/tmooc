package 语言基础;

public class ForDome {
    public static void main(String args[]) {

        /*
            for结构：
                语法：
                          1    2    3
                    for(要素1;要素2;要素3){
                              4
                        语句块/循环体
                    }
                 执行过程：
                    1 2 3 2 4 3 2 4 3
         */
        //输出5次"行动是成功的阶梯"
        for (int i = 0; i < 5; i++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("继续执行.....");

        /*
            补充：
                当作用域重叠时，变量不能重名
                for中的循环变量作用域------仅在当前for中
         */
        //输出9的乘法表
        for (int num = 1; num <= 9; num++) {
            System.out.println(num + "* 9 =" + num * 9);

        }
        /*
            num=1为true输出1* 9 =9
            num=2为true输出2* 9 =18
            num=3为true输出3* 9 =27
            num=4为true输出4* 9 =36
            num=5为true输出5* 9 =45
            num=6为true输出6* 9 =54
            num=7为true输出7* 9 =63
            num=8为true输出8* 9 =72
            num=9为true输出9* 9 =81
            num=10为false for循环结束
         */


        /*
            for的特殊语法格式：
                int num = 1;
                for(;num <= 9;num++){
                    语句块/循环体
                }


                三个要素都可以省略，分号不能省略
                不加条件就是死循环
         */
        /*
            逗号运算符：
                for(int i = 1,j =5; i <= 5; i+-2,j-=2){
                    语句块
                }
                两边可以用逗号，中间不可以
         */

        for (int num = 1; num <= 9; num++) {
            if (num == 4) {//某种特定条件下，提前结束循环
                break;//跳出循环
            }
            System.out.println(num + "* 9=" + num * 9);
        }

        for (int num = 1; num <= 9; num++) {
            //输出9的乘法表，跳过能被3整除的
            if (num % 3 == 0) {//某种特定条件下，跳出本次循环
               continue;//跳过循环体中剩余语句而进入下一次循环
            }
            System.out.println(num + "*9=" + num * 9);
        }




    }
}
