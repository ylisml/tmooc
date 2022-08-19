package Practice;

import java.util.Scanner;

public class day04_02 {
    public static void main(String args[]){
        //接收用户输入的年份year和月份month，计算该年该月的天数，并输出
        Scanner scan = new Scanner(System.in);
        System.out.println("输入年、月");
        int year = scan.nextInt();
        int month = scan.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            switch(month){
                case 1:
                    System.out.println("31天");
                    break;
                case 2:
                    System.out.println("29天");
                    break;
                case 3:
                    System.out.println("31天");
                    break;
                case 4:
                    System.out.println("30天");
                    break;
                case 5:
                    System.out.println("31天");
                    break;
                case 6:
                    System.out.println("30天");
                    break;
                case 7:
                    System.out.println("31天");
                    break;
                case 8:
                    System.out.println("31天");
                    break;
                case 9:
                    System.out.println("30天");
                    break;
                case 10:
                    System.out.println("31天");
                    break;
                case 11:
                    System.out.println("30天");
                    break;
                case 12:
                    System.out.println("31天");
                    break;
            }
        }else {
            switch(month){
                case 1:
                    System.out.println("31天");
                    break;
                case 2:
                    System.out.println("28天");
                    break;
                case 3:
                    System.out.println("31天");
                    break;
                case 4:
                    System.out.println("30天");
                    break;
                case 5:
                    System.out.println("31天");
                    break;
                case 6:
                    System.out.println("30天");
                    break;
                case 7:
                    System.out.println("31天");
                    break;
                case 8:
                    System.out.println("31天");
                    break;
                case 9:
                    System.out.println("30天");
                    break;
                case 10:
                    System.out.println("31天");
                    break;
                case 11:
                    System.out.println("30天");
                    break;
                case 12:
                    System.out.println("31天");
                    break;
            }
        }

    }
}
