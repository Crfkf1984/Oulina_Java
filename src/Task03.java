import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task03 {
    public static void main(String[] args) throws IOException {
        Stream<String> streamFromFiles = Files.lines(Paths.get("src/Lhrn.txt"));
        System.out.println(streamFromFiles.collect(Collectors.toList()));
        Collection<String> collection = Arrays.asList("1,2,0", "4,5");

        System.out.println(Arrays.toString(collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new)));
    }
}
