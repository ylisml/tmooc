package Practice;

public class MethodTest {
    public static void main(String[] args){
        say();
        sayHi("lisi");
        sayHello("zhangsan",18);
        double a = getNum();
        System.out.println(a);
        int b = plus(8,78);
        System.out.println(b);
        int[] c = testArray();
        System.out.println(c.length);
    }

    public static void say(){
        System.out.println("大家好，我叫WKJ，今年38岁了");
    }
    public static void sayHi(String name){
        System.out.println("大家好，我叫"+name+"今年38岁了");
    }
    public static void sayHello(String name,int age){
        System.out.println("大家好，我叫"+name+"今年"+age+"岁了");
    }
    public static double getNum(){
        return 8.88;
    }
    public static int plus(int num1,int num2){
        int num = num1 + num2;
        return num;
    }
    public static int[] testArray(){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length;i++){
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }


}
