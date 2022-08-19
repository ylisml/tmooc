package API.day01;

public class StringStringBuilderDome {
    public static void main(String[] args) {
//        String s = "a";
//        for (int i = 0;i < 10000000;i++){
//            s = s+i;
//            System.out.println(i);
//        }

        StringBuilder s = new StringBuilder("a");
        for (int a = 0; a < 10000000;a++){
            s.append(a);
        }
        System.out.println(s);
        System.out.println("执行完毕");
    }
}
