package CollectIonFrameWorkAndMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapImpl {
    public static void main(String[] args) {
        // Navigable Map  extends SortedMap, providing more
        // powerfull navigation ioptions such as finding the closest matching key,
        // or retrieving the map in reverse order.

        NavigableMap<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"One");
        navigableMap.put(2,"Two");
        navigableMap.put(3,"Three");

        System.out.println("Printing the navigable map :" + navigableMap);
        System.out.println(navigableMap.lowerKey(4));//3
        System.out.println(navigableMap.higherKey(2));
    }
}
