package streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collector is a utilty class . provides metghods to crearte collectors

        //1 collecrting to a list
//        List<String> names = new ArrayList<>();
//        names.add("Bob");
//        names.add("Alice");
//        names.add("Marley");
//        names.add("Jophn");
//        names.add("Arpit");
//        List<String> filteredList = names.stream()
//                .filter(name->name.startsWith("A"))
//                .collect(Collectors.toList());
//        System.out.println(filteredList);
//        //2. Collecting to a set
//
//        List<Integer> integers = Arrays.asList(1,2,2,2,2,3,4,4,4,5,6,6,7,7,8,9,10);
//        Set<Integer> filteredInteger = integers.stream()
//                .filter(x->x>=3)
//                .collect(Collectors.toSet());
//        System.out.println(filteredInteger);
//
//        List<Integer> integers2 = Arrays.asList(1,2,3,4);
//        ArrayList<Integer> collect = integers2.stream()
//                .collect(Collectors.toCollection(ArrayList::new));
//        System.out.println(collect);
//        System.out.println(collect.getClass().getName());
//        //joining strings
//        String joinedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(","));
//        System.out.println(joinedNames);
        
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        IntSummaryStatistics collect1 = numbers.stream().collect(Collectors.summarizingInt(x->x+1));
        System.out.println(collect1.getMax());
        System.out.println(collect1.getMin());
        System.out.println(collect1.getAverage());
        System.out.println(collect1.getCount());

        // grouping
        List<String> newList = Arrays.asList("Bob","Tom","Nice","Banton");
        Map<Integer, List<String>> groupedNewList1 = newList.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(groupedNewList1);

        Map<Integer, String> groupedNewList2 = newList.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(",")));
        System.out.println(groupedNewList2);

        List<String> fruits = Arrays.asList("Orange","Apple","Apple","Kiwi","Orange");
        Map<String, Integer> newmap = fruits.stream().collect(Collectors.toMap((k -> k), v -> 1, (x, y) -> x + y));
        System.out.println(newmap);
    }

}
