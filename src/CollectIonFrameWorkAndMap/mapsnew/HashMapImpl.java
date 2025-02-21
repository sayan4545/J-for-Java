package CollectIonFrameWorkAndMap.mapsnew;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Sayan C");
        map.put(2,"Akshay");
        map.put(3,"Chandrika D");
        System.out.println(map);

        String st = map.get(2);
        System.out.println(st);

        System.out.println(map.containsKey(34));
        System.out.println(map.containsValue("Chandrika D"));

        for(int i: map.keySet()){
            System.out.println(map.get(i));
        }

        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+": "+m.getValue());
        }

        HashMap<String,Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("apple",50);
        fruitsMap.put("banana",100);
        fruitsMap.put("kiwi",200);
        fruitsMap.put("Oranges",10);

        HashMap<Student,String> map2 = new HashMap<>();
        Student s1 = new Student(1,"Bob");
        Student s2 = new Student(2,"Alice");
        Student s3 = new Student(1,"Bob");
        map2.put(s1,"Engineer");
        map2.put(s2,"Doctor");
        map2.put(s3,"Plumber");
        System.out.println(map2.size());


    }
}
