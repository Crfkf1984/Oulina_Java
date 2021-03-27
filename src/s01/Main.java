package s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(2);
        list2.add(8);
        ListIterator<Integer> listIterator1 = list1.listIterator();
        ListIterator<Integer> listIterator2 = list2.listIterator();

        while (listIterator1.hasNext()) {
            Integer res1 = listIterator1.next();
            Integer res2 = listIterator2.next();
            if (!res1.equals(res2)) {
                listIterator1.add(res2);
                listIterator2.remove();
            }
        }

        listIterator1 = list1.listIterator();
        while (listIterator1.hasNext()) {
            Integer wer = listIterator1.next();
            System.out.print(wer);
        }

        System.out.println();

        listIterator2 = list2.listIterator();
        Integer i = listIterator2.next();
        System.out.println(i);
    }
}
