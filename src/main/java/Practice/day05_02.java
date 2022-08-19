package Practice;

public class day05_02 {
    public static void main(String[] args) {

        //利用for循环计算：求8的阶乘，并输出
        int sum = 1;
        for (int i = 1; i <= 8; i++) {
            sum *= i;
        }
        System.out.println(sum);

    }
}
