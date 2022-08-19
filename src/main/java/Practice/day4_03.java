package Practice;

public class day4_03 {
    public static void main(String args[]){
        //利用循环语句while计算数字1到100的和，并输出
        int num = 1;
        int sum = 0;
        while (num <=100){
           sum+=num;
           num++;
        }
        System.out.println(sum);
    }
}
