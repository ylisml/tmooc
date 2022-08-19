package Practice;

import java.util.Random;
import java.util.Scanner;

// 生成一个4位验证码(数字和字母的组合)，输出到控制台并提示用户输入验证码，输入后若正确则提示验证码正确，若错误则提示验证码错误。注意：不区分大小写
public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        String str = t.Rand();
        System.out.println(str);
        Scanner scan = new Scanner(System.in);
        String s =scan.next();
        s = s.toUpperCase();
        if (s.equals(str)){
            System.out.println("通过！");
        }else {
            System.out.println("不通过！");
        }
    }

    private String Rand() {
        String[] str = {"0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"};
        Random random = new Random();
        int[] index = new int[4];
        String[] rand = new String[4];
        String s = "";
        for (int i = 0; i < index.length; i++) {
            index[i] = random.nextInt(61);
            rand[i] = str[0].substring(index[i], index[i] + 1);
            rand[i] = rand[i].toUpperCase();
            s += rand[i];
        }
        return s;
    }

}
