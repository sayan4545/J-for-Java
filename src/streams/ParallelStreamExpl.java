package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStreamExpl {
    public static void main(String[] args) {
        // Scenario 1--> We are checking the time consumption using stream() and parallelStream(). There is a
        // considerable reduction in the time consumed while using parallelStream() rather than using stream().
        /*
        Parallel streams enable concurrent processing of elements by internally
        dividing the data into multiple chunks and processing them simultaneously using multiple threads.
        This parallel execution can significantly
        improve performance when dealing with large data sets or computationally intensive operations and the tasks are
        independent.
         */
//        List<Integer> integers = Stream.iterate(1,x->x+2).limit(20000).toList();
//        long startTime  = System.currentTimeMillis();
//        List<Long> factorialList = integers.parallelStream().map(x -> factorial(x)).toList();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken in this operation susng stream() is : " + (endTime-startTime)+ " ms");

//        List<Integer> list1 = Stream.iterate(1,x->x+1).limit(10).toList();
//        System.out.println(list1);
//        AtomicInteger sum = new AtomicInteger();
//
//        List<Integer> cumSum = list1.stream().map(x->{
//            int i = x+ sum.get();
//            sum.set(i);
//            return  i;
//
//        }).toList();
//        System.out.println(cumSum);
//        long counted = Stream.iterate(1,x->x+2).limit(10).peek(System.out::println).count();
//        System.out.println(counted);
        Integer max = Stream.of(22, 33, 55, 11).max(Comparator.naturalOrder()).get();
        Integer min = Stream.of(1,2,3,5).min((o1,o2)->o1-o2).get();
        System.out.println(max);
        System.out.println(min);
        Object[] arr = Stream.of(1, 2, 3, 4).toArray();
        System.out.println(Arrays.toString(arr));

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Kiwi","banana"),
                Arrays.asList("Oranges","grapes"),
                Arrays.asList("DragonFruit","Amla")
        );

        List<String> flatListOfLists = listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList();
        System.out.println(flatListOfLists.getClass().getName());

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java is useful",
                "backend language"
        );
        List<String> listofsentence = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList();
        System.out.println(listofsentence);
        List<String> list2 = listofsentence.stream().map(s -> s.toLowerCase()).toList();
        System.out.println(list2);

        Stream<Integer> streamOfIntegers = Stream.of(1,2,3,4);
        Long countNumber = streamOfIntegers.map(x->x+3).count();
        //Long countNumber2 = streamOfIntegers.filter(x->x%2==0).count(); --> This will throw an IllegalStateException
        // srtream cannot be resused after an terminal operation is done or executed.
    }
    private static Long factorial(int n){
        long result = 1;
        for(int i=1;i<=n;i++){
            result = result *i;
        }
        return result;
    }
}
