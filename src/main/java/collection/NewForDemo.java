package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 增强型for循环，JDK1.5之后推出的一个新特性
 * 可以让我们用相同的语法遍历集合和数组
 * 语法：
 * for(类型 变量名 : 集合或数组){。。。。}
 */
public class NewForDemo {
    public static void main(String[] args) {

        String[] array = {"one","two","three","four","five"};
        for (String str : array){
            System.out.println(str);
        }


        Collection<String> c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        Iterator<String> it = c.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }


        /**
         * 新循环遍历集合会被编译器改回成迭代器
         */
        for (Object obj : c){
            String str = (String)obj;
            System.out.println(str);
        }

    }
}
