package 语言基础;

import java.util.Scanner;

public class Addition {
    //随机加法运算器
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int score = 0;//总分
        for (int i = 1;i <= 10;i++){//10次
            int a = (int) (Math.random()*100);//加数a--0到99的随机数
            int b = (int)(Math.random()*100);//加数b--0到99到随机数
            int result = a + b;//存储一个答案
            System.out.println("("+i+")"+a+"+"+b+"="+"?");
            System.out.println("算吧！");
            int answer = scan.nextInt();//答题
            if(answer == -1){
                break;//提前退出
            }else if (answer == result){
                System.out.println("答对了！");
                score+=10;
            }else{
                System.out.println("答错了！");
            }
        }
        System.out.println("总分为：" + score);



    }
}
