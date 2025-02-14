package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Streams --> java 8 feature that enables us to process collections of data in a
        // functional and declarative way. It improes readabilty and maintainabilty.
        // decreases the chances of error.
        // Improves parallelism without multithreading.
        // ** source --> intermediate operation--> terminal operation**
        //What are streams? --> A sequesnce of elements that support functional and declarative programming.
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        System.out.println(list1.stream().filter(x->x%2==0).count());
        List<Integer> salaries = Arrays.asList(23456,89787,10000,878767,10001010,34098);
        System.out.println(salaries.stream().sorted((x,y)->y-x).collect(Collectors.toList()));
        Stream<Integer> str = Stream.generate(()->1).limit(10);
        System.out.println(str.collect(Collectors.toList()));
        Stream.of(1,2,3,54,90);
        Stream<Integer> str2  = Stream.iterate(1,x->x+1).limit(10);
        System.out.println(str2.collect(Collectors.toList()));
    }
}
