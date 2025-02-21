package CollectIonFrameWorkAndMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashmapimpl {
    public static void main(String[] args) {
        IdentityHashMap<String,Integer> newMap = new IdentityHashMap<>();
        String key1 = new String("key");
        String key2 = new String("key");
        newMap.put(key1,67);
        newMap.put(key2,100);
        System.out.println(newMap);
        System.out.println("Size of the identityhashmap is : "+ newMap.size());
        HashMap<String,Integer> newMap2 = new HashMap<>();
        newMap2.put(key1,100);
        newMap2.put(key2,199);
        System.out.println(newMap2);
        System.out.println("Size of the hashMap is : "+ newMap2.size());

    }
}
