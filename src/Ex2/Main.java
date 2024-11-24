package Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        CollectionUtils.addAll(list1, list2);
        System.out.println(list2);

    }
}
