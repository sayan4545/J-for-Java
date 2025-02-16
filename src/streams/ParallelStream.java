package streams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // A type of stream that allows parallel proce4ssing
        // Allows multiple threads to process parts of stream parallely.
        // this can significantly improve the performance for processing large datasets.

        List<Integer> integers = Stream.iterate(1,x->x+1).limit(20000).toList();
        long startTime = System.currentTimeMillis();
        List<Long> integerFact = integers.parallelStream().map(x -> fact(x)).toList();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken in the process: " + (endTime-startTime) +" ms");

//        long startTimeNormalStream = System.currentTimeMillis();
//        List<Long> integerFactorial = integers.stream().map(x->fact(x)).toList();
//        long endTimeNormalStream = System.currentTimeMillis();
//        System.out.println("Time taken in the process : "+ (endTimeNormalStream-startTimeNormalStream)+ " ms");
//        List<Long> integerFactorials = integers.parallelStream().map(x -> fact(x)).toList();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken in the process: " + (endTime-startTime) +" ms");

//        List<Integer> list = Stream.iterate(1,x->x+1).limit(20000).toList();
//        long startTime = System.currentTimeMillis();
//        List<Long> list1 = list.parallelStream().map(x -> fact(x)).toList();
//        long endTime = System.currentTimeMillis();
//        System.out.println("Time taken in the process: " + (endTime-startTime)+ " ms");
    }
//    private static long fact(int n){
//        if(n<=1) return 1;
//        return fact(n-1)*n;
//    }
private static long fact(int n) {
    long result = 1;
    for (int i = 1; i <= n; i++) {
        result *= i;
    }
    return result;
}

}
