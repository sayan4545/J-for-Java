package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapImpl {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>(10,2.5f);
        String key1 = new String("key");
        String key2 = new String("key");
        String key3 = key1;
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(map);
        for(Map.Entry<String,Integer> entries: map.entrySet()){
            System.out.println(entries);
        }
        System.out.println("------------");
        Map<String,Integer> map2 = new IdentityHashMap<>(10);
        map2.put(key1,1);
        map2.put(key2,2);
        map2.put(key3,4);
        for(Map.Entry<String,Integer> entries : map2.entrySet()){
            System.out.println(entries);
        }
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(System.identityHashCode(key3));

    }
}
