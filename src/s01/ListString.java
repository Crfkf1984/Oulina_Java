package s01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListString {
    public static void main(String[] args) {
        IntStream intStream = "4521".chars();
        System.out.println(intStream.count());
        System.out.println(intStream.min());
        System.out.println(intStream.max());
    }

}
