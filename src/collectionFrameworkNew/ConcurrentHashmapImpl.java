package collectionFrameworkNew;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentHashmapImpl {
    public static void main(String[] args) {
        ConcurrentMap<Integer,String> concurrentMap = new ConcurrentHashMap<>(10,2);
        // segement based locking.
        // Wbhat it does? it breaks the concurrentHashMap into smallesr hashmaps and
        // The segment that is either read or written is locked. Others are free
        // By read, only when the write operation is done simultaneously
        // In java 8 , there is no segmentation. It uses Compare and swap approach.
        // No locking except collision and resizing.
        ConcurrentSkipListMap<Integer,String> m1 = new ConcurrentSkipListMap<>();
        m1.put(100,"Sayan");
        m1.put(34,"Chandrika");
        m1.put(190,"Towhid");
        System.out.println(m1);
        for(Integer i : m1.keySet()){
            //System.out.println("reading..");
            //System.out.println(m1.get(i));
            if(m1.get(i)=="Chandrika"){
                m1.put(200,"adrit");
            }
            System.out.println("Writing..");
        }
        System.out.println(m1);

    }
}
