package s01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Summator summator = (x, y) -> x + y;
        int rsl = summator.result(2, 3);
        System.out.println(rsl);
    }

}
