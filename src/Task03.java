import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task03 {
    public static void main(String[] args) throws IOException {
        IntStream chars = "4521".chars();
        //System.out.println(chars.count());
        //System.out.println((char) chars.min().getAsInt());
        //System.out.println((char)chars.max().getAsInt());
        System.out.println(chars.map((c) -> Character.getNumericValue(c)).sum());
    }
}
