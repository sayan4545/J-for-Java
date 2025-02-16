package streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExpl {
    public static void main(String[] args) {
        // Scenario 1--> We are checking the time consumption using stream() and parallelStream(). There is a
        // considerable reduction in the time consumed while using parallelStream() rather than using stream().
        /*
        Parallel streams enable concurrent processing of elements by internally
        dividing the data into multiple chunks and processing them simultaneously using multiple threads.
        This parallel execution can significantly
        improve performance when dealing with large data sets or computationally intensive operations.
         */
        List<Integer> integers = Stream.iterate(1,x->x+2).limit(20000).toList();
        long startTime  = System.currentTimeMillis();
        List<Long> factorialList = integers.parallelStream().map(x -> factorial(x)).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken in this operation susng stream() is : " + (endTime-startTime)+ " ms");


    }
    private static Long factorial(int n){
        long result = 1;
        for(int i=1;i<=n;i++){
            result = result *i;
        }
        return result;
    }
}
