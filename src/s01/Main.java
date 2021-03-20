package s01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пин код!");
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        Predicate predicate = (x) -> x.equals(4) || x.equals(6);
        boolean rsl = predicate.test(res.length());
        System.out.println(rsl);
    }

}
