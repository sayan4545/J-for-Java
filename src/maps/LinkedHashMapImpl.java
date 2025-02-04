package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImpl {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("Apple",10);
        map1.put("Guava",100);
        map1.put("Banana",1000);
        for(Map.Entry<String,Integer> entries: map1.entrySet()){
            System.out.println(entries);

        }
        System.out.println("--------");
        LinkedHashMap<String,Integer> map2 = new LinkedHashMap<>(10,2,true);
        map2.put("Apple",10);
        map2.put("Guava",100);
        map2.put("Banana",1000);
        for(Map.Entry<String,Integer> entries: map2.entrySet()){
            System.out.println(entries);
        }
        System.out.println(map2.get("Apple"));
        for(Map.Entry<String,Integer> entries: map2.entrySet()){
            System.out.println(entries);
        }
    }
}
