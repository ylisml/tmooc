package 语言基础;

//九九乘法表
public class MultiTable {
    public static void main(String[] args) {
        /*
            \t：固定占8位
         */
        for (int num = 1; num <= 9; num++) {//控制行
            for (int i = 1; i <= num; i++) {//控制列
                System.out.print(i + "*" + num + "=" + i * num + "\t");
            }
            System.out.println();//换行
        }

        /*
            嵌套循环：
                循环中套循环，常常多行多列中使用，一般外层控制行内层控制列
                执行规则：外层循环走一次，内层循环走所有次
                建议：嵌套层数越少越好，能用一层不用两层，能用两层不用三层
                break只能跳出当前层循环
         */


    }
}
