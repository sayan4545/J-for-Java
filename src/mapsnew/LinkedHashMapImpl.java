package mapsnew;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapImpl {
    public static void main(String[] args) {
        HashMap<String,Integer> map1 = new HashMap<>();
        LinkedHashMap<String ,Integer> map2 = new LinkedHashMap<>();
        map1.put("Sayan",10);
        map1.put("Chandrika",100);
        map1.put("Rina",100);
        map2.put("Sayan",10);
        map2.put("Chandrika",100);
        map2.put("Rina",100);
        for(Map.Entry<String, Integer> entry : map1.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("--------");
        System.out.println("IN CASE OF LINKEDHASHMAP");

        for(Map.Entry<String,Integer> entry : map2.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }
}
