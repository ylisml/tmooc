package 语言基础;

import java.util.Scanner;//导入扫描仪
public class ScannerDemo {
    public static void main(String args[]){

        /*
            Scanner：是Java给大家提供的一个零件
            Scanner接收用户输入的数据：共三步
         */
        Scanner scan = new Scanner(System.in);//新建一个扫描仪叫scan
        System.out.println("请输入年龄：");
        int age = scan.nextInt();//用扫描仪扫描一个整数值赋值给age
        System.out.println("请输入商品的价格：");
        double price = scan.nextDouble();
        System.out.println("年龄为:" + age + ",商品的价格为：" + price);

    }
}
