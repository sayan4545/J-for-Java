package collectionFramework.list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorImpl {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());
        for(int i=0;i<11;i++){
            vector.add(i*2);
        }
        System.out.println(vector);
        System.out.println(vector.capacity());
        Vector<Integer> v1 = new Vector<>(3,3);
//        v1.add(10);
//        v1.add(10);
//        v1.add(10);
//        System.out.println(v1.capacity());
//        v1.add(11);
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println(v1.capacity());
//        Thread t1 = new Thread(() -> {
//            for(int i=0;i<1000;i++){
//                v1.add(i);
//            }
//        });
//        Thread t2 = new Thread(() -> {
//            for(int i=0;i<1000;i++){
//                v1.add(i);
//            }
//        });
//
//        t1.start();
//        t2.start();
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(v1.capacity());
//        System.out.println(v1.size());
        Thread t3 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                l1.add(i);
            }
        });
        Thread t4 = new Thread(() -> {
            for(int i=0;i<1000;i++){
                l1.add(i);
            }
        });

        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(v1.capacity());
        System.out.println(l1.size());


    }
}
