package s01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        char h = '+'; char t = '-'; char j = '/'; char r = '*';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую переменную!");
        int a = scanner.nextInt();
        System.out.println("Введите вторую переменную!");
        int d = scanner.nextInt();
        System.out.println("Введите знак выражения!");
        char c = scanner.next().charAt(0);
        System.out.println("Подождите выполняется операция ,,,");

        if (h == c) {
            BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
            int e = binaryOperator.apply(a, d);
            System.out.println(e);
        } else if (r == c){
            BinaryOperator<Integer> binaryOperator = (x, y) -> x * y;
            int g = binaryOperator.apply(a, d);
            System.out.println(g);
        } else if (t == c){
            BinaryOperator<Integer> binaryOperator = (x, y) -> x - y;
            int k = binaryOperator.apply(a, d);
            System.out.println(k);
        } else if (j == c){
            BinaryOperator<Integer> binaryOperator = (x, y) -> x / y;
            int f = binaryOperator.apply(a, d);
            System.out.println(f);
        } else {
            System.out.println("Символ не корректен!");
        }
        scanner.close();
    }

}
