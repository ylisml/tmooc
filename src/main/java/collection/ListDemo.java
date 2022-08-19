package collection;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println("list:"+list);

        /*
            list接口中提供了一套可以通过下标操作元素的方法

            E get(int index)
         */
        String e = list.get(2);
        System.out.println(e);
        /*
            将给定元素设置到指定位置上，返回值为被替换的元素
         */
        String old = list.set(2,"six");
        System.out.println(list);
        System.out.println(old);

        for (int i = 0;i < list.size()/2 ;i++){
            String a = list.get(i);
            String b = list.set(list.size() -(i+1),a);
            list.set(i,b);
        }
        System.out.println(list);
    }
}
