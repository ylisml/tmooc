package thread;

import java.util.Scanner;

/**
 * 线程的静态方法：
 * stativ void sleep(long ms)
 */
public class SleepDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入倒计时秒:");
        int ms = scan.nextInt();
        for (int i = ms; i >= 0; i--) {
            System.out.println("还有" + i + "ms");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
