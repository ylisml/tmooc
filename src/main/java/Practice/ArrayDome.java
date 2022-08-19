package Practice;

public class ArrayDome {
    public static void main(String[] args){

        //数组小代码练习：声明、初始化、访问、遍历
        int[] arr = new int[10];
        for (int i = 0 ;i < 10;i++){
            arr[i] = (int) (Math.random()*1000);
            System.out.println(arr[i]);
        }


    }
}
