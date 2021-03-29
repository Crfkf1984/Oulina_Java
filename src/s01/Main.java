package s01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(4, 5, 3));
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(2);
        list2.add(8);
        list2.add(7);
        list2.add(5);
        ListIterator<Integer> listIterator1;
        ListIterator<Integer> listIterator2 = list2.listIterator();


        while (listIterator2.hasNext()) {
            Integer res2 = listIterator2.next();
            if (!list1.contains(res2)) {
               list1.add(res2);
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
       listIterator2.forEachRemaining(System.out::print);
    }
}
