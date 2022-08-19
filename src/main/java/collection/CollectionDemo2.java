package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(2,3));
        c.add(new Point(3,4));
        System.out.println(c);

        Point p = new Point(1,2);
        System.out.println("是否包含:" + c.contains(p));
        c.remove(p);
        System.out.println(c);

    }
}
