package 语言基础;

import java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        //求数组元素的最大值，并将最大值放在数组的最后一个元素的下一个

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            //System.out.println(arr[i]);
        }

        //找最大值:
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);
        arr = Arrays.copyOf(arr, arr.length + 1);//扩容
        arr[arr.length - 1] = max;
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
