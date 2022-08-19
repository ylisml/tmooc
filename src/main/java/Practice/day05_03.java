package Practice;

public class day05_03 {
    public static void main(String[] args) {

        //利用for循环计算：打印字符*组成的等腰三角形，输出结果如下所示：
        for (int i = 1; i <= 11; i += 2) {
            for (int j = 11 - i; j >= 1; j -= 2) {
                System.out.print(" ");
            }
            for (int s = 0; s < i; s++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
