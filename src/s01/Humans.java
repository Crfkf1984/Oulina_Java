package s01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Humans {
    String firstName;
    String lastName;
    int age;
    int weight;

    public Humans(int age, String firstName, String lastName, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Collection<Humans> humans = new ArrayList<>(Arrays.asList(new Humans(25,"Philip", "Kirkorov", 172),
                new Humans(126, "Alisa", "Ivanov", 162),
                new Humans(227, "Dema", "Bilan", 76),
                new Humans(30, "Polina", "Gagarina", 100)));

        System.out.println(humans.stream().sorted(Comparator.comparing(o -> o.firstName)).collect(Collectors.toList()));
        System.out.println(humans.stream().sorted(Comparator.comparing(o -> o.lastName)).collect(Collectors.toList()));
        System.out.println(humans.stream().mapToInt((o) -> Integer.valueOf(o.age)).sum());

        System.out.println(humans.stream().filter((x) -> x.age < 50).collect(Collectors.toList()));
        System.out.println(humans.stream().sorted(Comparator.comparing(x -> x.weight)).collect(Collectors.toList()));
        humans.stream().map((x) -> x.firstName + " ").forEach(System.out::print);

        System.out.println(humans.stream().sorted(Comparator.comparing((x) -> - x.weight)).collect(Collectors.toList()));
        System.out.println(humans.stream().filter(x -> !x.lastName.equals("Ivanov")).collect(Collectors.toList()));
       System.out.println(humans.stream().map((x) -> x.age).reduce((x, y) -> x.intValue() * y.intValue()).get());

        System.out.println(humans.stream().sorted(Comparator.comparing((x)-> x.firstName.charAt(1))).collect(Collectors.toList()));
        System.out.println(humans.stream().filter((x -> x.weight % 10 == 0)).collect(Collectors.toList()));
        System.out.println(humans.stream().sorted((x, y) -> Integer.compare( x.age * x.weight, y.age * y.weight)).collect(Collectors.toList()));

        System.out.println(humans.stream().sorted(Comparator.comparing(o -> - o.age)).collect(Collectors.toList()));
        System.out.println(humans.stream().filter(x -> x.firstName.startsWith("A")).collect(Collectors.toList()));
        System.out.println(humans.stream().mapToInt((x) -> x.weight).average().getAsDouble());

        humans.stream().mapToInt((x) -> x.weight - 5).forEach(System.out::println);
        humans.stream().map((x) -> x.lastName + " ").forEach(System.out::print);
        System.out.println();

        humans.stream().limit(3).map((x) -> x.firstName + " " + x.lastName + " ").forEach(System.out::print);
        System.out.println();

        humans.stream().sorted(Comparator.comparing(t ->  t.firstName.substring(t.firstName.length() - 1)) ).forEach(System.out::print);
        humans.stream().mapToInt((x) -> x.age + 3).forEach(System.out::println);
        System.out.println(humans.stream().mapToInt((x) -> x.age).average().getAsDouble());

        System.out.println(humans.stream().filter((x) -> x.weight > x.age).collect(Collectors.toList()));
        System.out.println(humans.stream().sorted((t, x) -> - t.lastName.compareTo(x.lastName)).collect(Collectors.toList()));
        System.out.println(humans.stream().mapToInt((r) -> r.age).sum());

        humans.stream().filter((x) -> x.firstName.contains("e")).forEach(System.out::println);
        System.out.println(humans.stream().limit(3).collect(Collectors.toList()));
        humans.stream().map((x) -> x.firstName.substring(0, 1) + " ").forEach(System.out::print);
    }

    @Override
    public String toString() {
        return "Humans{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
