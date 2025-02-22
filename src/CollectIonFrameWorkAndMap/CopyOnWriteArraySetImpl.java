package CollectIonFrameWorkAndMap;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetImpl {
    public static void main(String[] args) {
        // Thread safe
        // Copy on write mechanism
        // No duplicate elements
        // Iterators donot reflect modifications
        ConcurrentSkipListSet<Integer> s1 = new ConcurrentSkipListSet<>();
        CopyOnWriteArraySet<Integer> s2 = new CopyOnWriteArraySet<>();
        for(int i=1;i<6;i++){
            s1.add(i);
            s2.add(i);
        }
       // System.out.println(s1);
        System.out.println(s2);

        // Concurrent reading and writing
        for(int num : s1){
            System.out.println("Reading the concurrentSkipListSet..: "+num);
            s1.add(6);
        }
        System.out.println(s1);
        for(int num: s2){
            System.out.println("Reading the copyOnWriteArraySet..: "+ s2);
            s2.add(6);
        }
        System.out.println(s2);
    }
}
