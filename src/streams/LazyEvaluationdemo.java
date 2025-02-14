package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationdemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sayan","Chandrika","Bobby");
        Stream<String> streamNames = names.stream().filter(x->{
            System.out.println("Filetering: "+ x);
            return x.length()>5;
        });
        System.out.println("Before terminal operation..");
        List<String> namesNew = streamNames.collect(Collectors.toList());
        System.out.println("After terminal operation..");
        System.out.println(namesNew);

    }
}
