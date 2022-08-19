package 语言基础;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    //猜数字小游戏
    public static void main(String args[]) {
        //用户猜的数guess
        int num = (int)(Math.random()*1000)+1;
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        while (num != guess) {
            if (guess > num) {
                System.out.println("猜吧！");
                guess = scan.nextInt();
                System.out.println("太大了！");
            } else if(guess < num){
                System.out.println("太小了！");
            }else {
                System.out.println("恭喜你猜对了！");
            }
        }



    }
}
