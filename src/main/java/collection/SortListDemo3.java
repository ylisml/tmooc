package collection;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序字符串
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");
        System.out.println(list);
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num1 = o1.length();
                int num2 = o2.length();
                return num2-num1;
            }
        };
        Collections.sort(list,c);
        System.out.println(list);
        list.sort((o1,o2) -> o1.length() -o2.length());//lambda表达式
        System.out.println(list);
    }
}
