package Practice;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        /*
            Addition随机加法运算器
            要求：由系统随机出10道加法题，而后由用户来答题，答题后输出"答对了"或"答错了"，答对1题得10分，答错1题不扣分，最后输出总分数。
         */

        Scanner scan = new Scanner(System.in);
        int score = 0;
        for (int i = 0;i < 10;i++){
            int a = (int) (Math.random()*100);
            int b = (int) (Math.random()*100);
            System.out.println(a + "+"+b+"= ?");
            System.out.println("答吧！");
            int result = a + b;
            int answer = scan.nextInt();
            if (answer == -1){
                break;
            }else if(answer == result){
                System.out.println("答对了");
                score+=10;
            }else {
                System.out.println("答错了");
            }
        }
        System.out.println("总分："+score);

    }
}
