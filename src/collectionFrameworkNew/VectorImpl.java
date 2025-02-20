package collectionFrameworkNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorImpl {
    public static void main(String[] args) {
        MyThread1 t12 = new MyThread1();
        Vector<Integer> vector1 = new Vector<>();
        List<Integer> al1 = new ArrayList<>();
//        vector1.add(1);
//        vector1.add(10);
//        vector1.add(100);
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                vector1.add(i);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                vector1.add(i);
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
        System.out.println(vector1.size());
        vector1.removeIf(x->x%2==0);
        //System.out.println(vector1);
        System.out.println(vector1.capacity());


    }
}
