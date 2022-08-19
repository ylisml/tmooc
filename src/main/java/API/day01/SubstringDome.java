package API.day01;

/**
 * String substring(int start,int end);
 * 截取当前字符串中指定范围的字符串（含头不含尾------包含start但是不包含end）
 */
public class SubstringDome {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        String name = str.substring(4,8);
        System.out.println(name);//tedu

        name = str.substring(4);
        System.out.println(name);//tedu.cn
    }
}
