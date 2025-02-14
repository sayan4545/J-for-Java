package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        // Intermediate operations transform one stream into another.
        // They are lazy, they dont execute untill a terminal operation is executed.
        List<String> names = Arrays.asList("Ram","Shyam","Badri","Dimpi","Dimpi");
        Stream<String> filteredStream = names.stream().filter(s->s.startsWith("S"));
        // no filtering till this point actually. filtering occurs when the terminal operation is
        // executed.
        long result = filteredStream.count();
        System.out.println(result);
        Stream<String> toUpperCaseStrings = names.stream().map(String::toUpperCase);

        Stream<String> sortedByLength = names.stream().sorted((a, b) -> a.length() - b.length());
        System.out.println(names.stream().distinct().count());

        //limit and skip
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(10).count());
        Stream.iterate(1,x->x+1).skip(10).limit(10).forEach(x->System.out.println(x));

    }
}
