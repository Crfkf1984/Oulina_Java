package s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Humans {
    public static void main(String[] args) {
        Collection<Human> humans = new ArrayList<>(Arrays.asList(new Human(25,"Philip", "Kirkorov", 172),
                new Human(126, "Kolya", "Ivanov", 162),
                new Human(227, "Dima", "Bilan", 76),
                new Human(33, "Polina", "Gagarina", 17)));
        System.out.println(humans.stream().sorted(Comparator.comparing(o -> o.firstName)).collect(Collectors.toList()));
        System.out.println(humans.stream().sorted(Comparator.comparing(o -> o.lastName)).collect(Collectors.toList()));
        System.out.println(humans.stream().mapToInt((o) -> Integer.valueOf(o.age)).sum());
        System.out.println(humans.stream().filter((x) -> x.age < 50).collect(Collectors.toList()));
        System.out.println(humans.stream().filter((x) -> x.weight < 50).collect(Collectors.toList()));
        humans.stream().map((x) -> x.firstName + " ").forEach(System.out::print);
        System.out.println(humans.stream().sorted((o1, o2) -> Integer.compare(-o1.weight, o2.weight)).collect(Collectors.toList()));
        System.out.println(humans.stream().filter(x -> !x.lastName.equals("Ivanov")).collect(Collectors.toList()));
        //System.out.println(humans.stream().mapToInt((x) -> Integer.valueOf(x.age) * 1)); не могу вывести инт произвед в соут
        System.out.println(humans.stream().sorted(Comparator.comparing((x)-> x.firstName.charAt(1))).collect(Collectors.toList()));
        // тут нужно сделать из задания 4 сортировку по весу.
        System.out.println(humans.stream().sorted((x, y) -> Integer.compare( x.age * x.weight, y.age * y.weight)).collect(Collectors.toList()));
    }
}
