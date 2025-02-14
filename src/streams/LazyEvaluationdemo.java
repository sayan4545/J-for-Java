package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationdemo {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Sayan","Chandrika","Bobby");
//        Stream<String> streamNames = names.stream().filter(x->{
//            System.out.println("Filetering: "+ x);
//            return x.length()>5;
//        });
//        System.out.println("Before terminal operation..");
//        List<String> namesNew = streamNames.collect(Collectors.toList());
//        System.out.println("After terminal operation..");
//        System.out.println(namesNew);

        List<Integer> list1 = Arrays.asList(1,3,5,7);
        Stream<Integer> integerStream = list1.stream().map(x -> {
            System.out.println("Mapper: " + x);
            return x * x;
        });
        System.out.println("Before the terminal operation..");
        Set<Integer> collect = integerStream.collect(Collectors.toSet());
        System.out.println("After terminal operation..");
        System.out.println(collect);

    }
}
