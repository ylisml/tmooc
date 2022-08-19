package Io;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Notepa {
    public static void main(String[] args) throws FileNotFoundException {
        PWDemo2 pwDemo2 = new PWDemo2();
        Scanner scan = new Scanner(System.in);
        String s = "";
        while (!"exit".equals(s)){
            s = scan.nextLine();
            if (!"exit".equals(s)){
                pwDemo2.flow("/Users/yanghongtao/Java/Io/Notepad.txt",true,s);
            }
        }
        System.out.println("结束运行!");
    }
}
