package s01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> h = new HashSet<>();
        h.add(1); h.add(2); h.add(3); h.add(-9);
        h.add(-7);
        Iterator<Integer> iterator = h.iterator();
        while (iterator.hasNext()) {
            Integer res = iterator.next();
            if (res <= 0) {
                iterator.remove();
            }
        }
        iterator = h.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
