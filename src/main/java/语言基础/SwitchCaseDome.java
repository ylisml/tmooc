package 语言基础;

public class SwitchCaseDome {
//switch....case结构演示
    public static void main(String args[]){
        /*
            switch....case结构：多条路
                优点：效率高、结构清晰
                缺点：只能对整数判断相等
                break:跳出switch
         */

        int num = 2;
        switch(num){//byte,short,char,int,枚举类型
            case 1:
                System.out.println("111");
            case 2://以此为入口一直到底
                System.out.println("222");
            case 3:
                System.out.println("333");
            default://默认的，所以case都没有匹配时执行
                System.out.println("666");
        }

    }

}
