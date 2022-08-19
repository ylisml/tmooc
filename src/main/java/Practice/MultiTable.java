package Practice;

public class MultiTable {
    public static void main(String[] args) {
        /*
            MultiTable九九乘法表
            要求：输出九九乘法表
         */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1 ; j <= i;j++){
                System.out.print(i + "*" + j + "=" + i*j +"\t");
            }
            System.out.println();
        }

    }
}
