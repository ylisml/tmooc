package API.day01;

public class StringBuilderDome {
    public static void main(String[] args) {
        //StringBuilder的创建方式
        StringBuilder builder1 = new StringBuilder();//空字符串
        StringBuilder builder2 = new StringBuilder("abc");//abc串

        String str = "abc";
        StringBuilder builder3 = new StringBuilder(str);//abc串

        String str2 = builder3.toString();//将builder3转换为String类型
    }
}
