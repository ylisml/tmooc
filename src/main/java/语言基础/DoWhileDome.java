package 语言基础;

import java.util.Scanner;

public class DoWhileDome {
    //do.....while结构的演示
    public static void main(String args[]) {
        /*
            do....while结构：先执行后判断，至少执行一次
                1）语法：
                    do{

                    }while(boolean);
                2)执行过程：
                    先执行语句块，再判断boolean的值，若为true则
                    再执行语句块，再判断boolean的值，若为true则
                    再执行语句块，如此反复，直到boolean值为false，do...while循环结束
         */

        //猜数字do....while版本
        int num = (int)(Math.random() * 1000)+1;
        Scanner scan = new Scanner(System.in);
        System.out.println("猜吧！");
        int guess = scan.nextInt();
        do {
            if (guess > num){
                System.out.println("太大了！");
                guess = scan.nextInt();
            }else {
                System.out.println("太小了！");
                guess = scan.nextInt();
            }
        }while(num != guess);
        System.out.println("恭喜你猜对了！");

        /*
            变量的作用域/范围：
                从变量的声明开始，到包含他最近的大括号结束
         */

    }
}
