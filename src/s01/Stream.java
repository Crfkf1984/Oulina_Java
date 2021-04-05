package s01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) throws IOException {
        Collection<String> arrayList = new ArrayList<>(Arrays.asList("Valentin", "vasya",
                "goga", "Vasya", "Petya"));
         System.out.println(arrayList.stream().distinct().collect(Collectors.toList()));
         System.out.println(arrayList.stream().distinct().limit(2).collect(Collectors.toList()));
          arrayList.stream().distinct().filter(x -> x.length() > 5).forEach(System.out::println);
        System.out.println(arrayList.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)).collect(Collectors.toList()));
    }
}
