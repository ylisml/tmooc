package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        System.out.println("Size:"+c.size());
        System.out.println("是否为空集："+c.isEmpty());
        c.clear();
        System.out.println("集合以清空"+c);
        System.out.println("Size:"+c.size());
        System.out.println("是否为空集："+c.isEmpty());
        }
    }
