package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,4));
        list.add(new Point(2,4));
        list.add(new Point(7,6));
        list.add(new Point(1,8));
        list.add(new Point(8,8));
        list.add(new Point(0,5));
        list.add(new Point(3,3));
        System.out.println(list);
        Comparator<Point> c = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return -1;
            }
        };

        Collections.sort(list,c);
        System.out.println(list);

    }
}
