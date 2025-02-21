package CollectIonFrameWorkAndMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapImpl {
    public static void main(String[] args) {
        // sorted map is an interface that extends the Map intefarce and ensures that
        // the entries aere sorted eitjher according the keys or by natural oredring or by a comparator defined
//        SortedMap<String,Integer> map1 = new TreeMap<>((a,b)->{
//            if(b.length()-a.length()>0){
//                return 1;
//            }
//            if(b.length()-a.length()<0){
//                return -1;
//            }
//            else{
//                return b.compareTo(a);
//            }
//        });
//        map1.put("Ankit",100);
//        map1.put("Chandrika",89);
//        map1.put("Sayani",78);
//        map1.put("Adritansha",88);
//        System.out.println("Printing the map: "+map1);
//
//        //System.out.println(map1.headMap("Sayani"));
//        //System.out.println(map1.tailMap("Chandrika"));
//        System.out.println(map1.subMap("Ankit","Sayani"));
        SortedMap<String, Integer> map1 = new TreeMap<>(
                (a, b) -> {
                    int lengthCompare = Integer.compare(b.length(), a.length());
                    return (lengthCompare != 0) ? lengthCompare : a.compareTo(b);
                }
        );

        map1.put("Ankit", 100);
        map1.put("Chandrika", 89);
        map1.put("Sayani", 78);
        map1.put("Adritansha", 88);

        System.out.println("Printing the map: " + map1);

        System.out.println("SubMap Example: " + map1.subMap("Adritansha", "Sayani"));
    }
}
