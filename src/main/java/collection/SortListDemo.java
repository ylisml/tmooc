package collection;

import java.util.*;

public class SortListDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(200));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
