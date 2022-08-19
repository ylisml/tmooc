package 语言基础;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String args[]) {

        //创建CommandBySwitch类，接收用户输入的命令command（int），并输出
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能：1、存款 2、取款 3、查询余额 4、退卡");
        int command = scan.nextInt();
        switch (command) {
            case 1:
                System.out.println("存款操作......");
                break;
            case 2:
                System.out.println("取款操作......");
                break;
            case 3:
                System.out.println("查询余额操作......");
                break;
            case 4:
                System.out.println("退卡操作........");
                break;
            default:
                System.out.println("操作错误");
                break;
        }


        if (command == 1) {
            System.out.println("存款操作......");
        } else if (command == 2) {
            System.out.println("取款操作......");
        } else if (command == 3) {
            System.out.println("查询余额操作......");
        } else if (command == 4) {
            System.out.println("退卡操作........");
        } else {
            System.out.println("操作错误");
        }



    }
}
