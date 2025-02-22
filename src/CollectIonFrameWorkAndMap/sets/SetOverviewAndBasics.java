package CollectIonFrameWorkAndMap.sets;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverviewAndBasics {
    public static void main(String[] args) {
        // sets --> donot contains duplicates. It is a collection.
        // Set --> HashSet,LinkedHashSet,TreeSet,EnumSet. These are the implementations of
        // set interface.
        // faster operations than list.

//        Set<Integer> set1 = new HashSet<>();
//        set1.add(12);
//        set1.add(10);
//        set1.add(100);
//        set1.add(10000);
//        set1.add(12);
//        System.out.println(set1);// returns unordered set
//        System.out.println(set1.size());
//        // for ordered set, use LinkedHashSet.
//        Set<Integer> set2 = new LinkedHashSet<>();
//        set2.add(100);
//        set2.add(1000);
//        set2.add(354);
//        set2.add(100000);
//        set2.add(354);
//        System.out.println(set2);

        // For sorted order, use TreeSet
        TreeSet<Integer> set3 = new TreeSet<>();
//        set3.add(100);
//        set3.add(345);
//        set3.add(23);
//        set3.add(234);

//        System.out.println(set3.descendingSet());
//        System.out.println(set3);

        //Set<Integer> set3Synchronized = Collections.synchronizedSet(set3);
//        Thread t1 = new Thread(()->{
//            for(int i=0;i<1000;i++){
//                set3.add(i);
//            }
//        });
//        Thread t2 = new Thread(()->{
//            for(int i=1000;i<2000;i++){
//                set3.add(i);
//            }
//        });
//        t1.start();
//        t2.start();
//        try{
//            t1.join();
//            t2.join();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        System.out.println(set3.size());

        Set<Integer> set4 = new ConcurrentSkipListSet<>();// To crearte ThreadSafe sets.
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                set4.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1000;i<2000;i++){
                set4.add(i);
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(set4.size());


    }
}
