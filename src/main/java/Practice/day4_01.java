package Practice;

import java.util.Scanner;

public class day4_01 {
    public static void main(String args[]){
        //接收用户输入的一个整数num，判断它的正负零值，正数则输出"+"，负数则输出"-"，0则输出"0"
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num > 0){
            System.out.println("+");
        }else if (num < 0){
            System.out.println("-");
        }else {
            System.out.println("0");
        }
    }
}
