package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了！");

        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("出现了空指针，并解决了");
        }
        
        System.out.println("程序结束了!");
    }
}
