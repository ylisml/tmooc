package 语言基础;

import java.util.Arrays;

public class ArrayDome {
    public static void main(String[] args) {

          /*
            数组：
                是一种数据类型（引用类型）
                相同数据类型元素的集合
                定义：
                    数据类型    变量名;
                    int[]      a    ;//声明一个整型数组的变量，名为a
                    int[] a = new int[5];//声明一个整型数组a，包含5个元素，每个元素都是int类型，默认值为0
                    double[] d = new double[20];//声明一个双精度数组，包含20个元素，每个元素都是double类型，默认值为0.0
                    boolean[] b = new boolean[50];//声明一个布尔型数组，包含50个元素，每个元素都是boolean类型。，默认值为false
                初始化-----------------初始化的是数组中的元素
                    int[] arr1 = new int[3];//0,0,0
                    int arr2 = {2,5,8};//2.5.8
                    int[] arr3 = new int[]{2,5,8};//2,5,8
                    int[] arr4;
                     //arr4 = {2,5,8};//编译错误，此方式只能声明同时初始化
                     arr4 = new int[]{2, 5, 8};//正确



                数组元素的默认值：
                    byte、short、int、long、char-------------默认值0。char为码0
                    float、double---------------------------默认值0.0
                    boolean---------------------------------默认值false



               访问：----------------访问的是数组中的元素
                    通过（数组名.length）可以获取数组的长度（元素的个数）
                    通过下标/索引来访问数组中的元素，下标从0开始，最大到（数组到长度-1）
                    arr[0]---------代表arr中的第一个元素（int）
                    arr[1]---------代表arr中的第二个元素（int）
                    System.out.println("arr[1]");//输出arr中的第二个元素

                    int[] arr =  new int[3];
                    arr[0] = 100;
                    arr[1] = 200;
                    arr[2] = 300;
                    System.out.println(arr[0]);
                    System.out.println(arr[arr.length-1]);

               遍历/迭代：
                    从头到尾挨个走一遍
                    int[] arr = new int[10];
                    //数组的遍历
                    for(int i = 0;i <arr.length;i++){//遍历arr数组
                           arr[i] = i * 100;
                           System.out.println(arr[i]);
                      }

         */
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//            System.out.println(arr[i]);
//        }

        //数组的复制
        int[] a = {10, 20, 30, 40};
        int[] b = new int[6];
        /* a:源数组
           1:源数组起始下标
           b:目标数组
           0:目标数组起始下标
           3: 要复制的元素个数
         */
        System.arraycopy(a, 1, b, 0, 3);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        /*
            a:源数组
            c:目标数组
            6:目标数组
            目标数组长度>源数组长度，则末尾默认补默认值
            目标数组长度<源数组长度，则末尾裁掉
         */
        int[] c = Arrays.copyOf(a, 6);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        /*
            排序是对数组所施加对最最常见的算法：
                降序（从大到小）
                升序（从小到大）
            排序算法有：冒泡排序、快速排序、插入排序、希尔排序.....
         */

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        Arrays.sort(arr);
        System.out.println("排序后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("倒序：");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }









    }
}
