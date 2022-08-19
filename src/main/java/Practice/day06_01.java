package Practice;

public class day06_01 {
    /*
        定义一个方法generate()
        - 根据第一个参数生成指定长度的int数组；
        - 根据第二个范围参数随机生成0到指定范围的随机数，填充到数组元素中，并将该数组返回；
        - 测试数组内容。
     */

    public static void main(String[] args){
        int[] a = generate(5,200);
        for (int b:a) {
            System.out.println(b);
        }
    }


    public static int[] generate(int length,int random){
        int[] arr = new int[length];
        for (int i = 0; i < arr.length;i++){
            arr[i] = (int)(Math.random()*(random +1));
        }
        return arr;
    }

}
