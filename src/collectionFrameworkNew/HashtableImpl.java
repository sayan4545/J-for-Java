package collectionFrameworkNew;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableImpl {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        //Map<Integer,String> hashtable = new HashMap<>();
        // null values not allowed
        // legacy class
        // synchroniized. So it is bit slower.
        // replaced by ConcurrentHashMap.
        //hashtable.put(0,null);
        //hashtable.put(1,"xyz");
        //System.out.println(hashtable);
        Thread t1 = new Thread(()->{
            for(int i=0;i<1000;i++){
                hashtable.put(i,"Thread1");
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1000;i<2000;i++){
                hashtable.put(i,"Thread 2");
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
        System.out.println(hashtable.size());
    }
}
