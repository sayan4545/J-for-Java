package CollectIonFrameWorkAndMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Bob");
        map1.put(2,"Alice");
        map1.put(3,"candy");
        Map<Integer, String> map1Unmodifiable = Collections.unmodifiableMap(map1);
        //map1Unmodifiable.put(4,"Gary");--> This will throw exception. UnsupportedOperation exception.
        System.out.println(map1Unmodifiable);
        Map<String, Integer> m2 = Map.of("Sayan", 78, "Akshit", 99);// This was introduced in Java 9
        // This has a downside, can hold upto 10 entries.
        System.out.println(m2);
        Map<Integer, Integer> m3 = Map.ofEntries(Map.entry(1, 78), Map.entry(2, 88));
        System.out.println(m3);

    }
}
