package s01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) throws IOException {
        Collection<String> collection = Arrays.asList("a1", "a2", "a3");
        //Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        //System.out.println(streamFromValues);
        //Stream<String> streamFromFiles = Files.lines(Paths.get("src/Lhrn"));
        IntStream streamFromString = "123".chars();
        System.out.println(streamFromString);
    }
}
