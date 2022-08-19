package Practice;

public class day05_01 {
    public static void main(String args[]) {

        //利用for循环计算：求数字1到100之内，所有偶数的和，并输出
        int sum = 1;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);


    }
}
