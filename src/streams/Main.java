package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

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
    }
}
