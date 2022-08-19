package 语言基础;

import java.util.Scanner;

public class ScoreLevel {
    public static void main(String args[]){
//成绩等级判断
        //创建ScoreLevel类，接收用户输入的成绩score（double），并输出
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入成绩：");
        double score = scan.nextDouble();
        /*
            A:成绩大于等于90
            B:成绩大于等于80并且小于90
            C:成绩大于等于60并且小于80
            D:成绩小于60
         */
        if (score < 0 || score > 100){
            System.out.println("成绩不合法");
        }else if (score >= 90){
            System.out.println("A-优秀");
        }else if (score >= 80){
            System.out.println("B-良好");
        }else if (score >= 60){
            System.out.println("C-中等");
        }else {
            System.out.println("D-不及格");
        }

        if (score >= 0 && score <= 100){
            if (score >= 90){
                System.out.println("A-优秀");
            }else if (score >= 80){
                System.out.println("B-良好");
            }else if (score >= 60){
                System.out.println("C-中等");
            }else {
                System.out.println("D-不及格");
            }
        }else {
            System.out.println("成绩不合法");
        }

    }
}
