package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static  void main(String[] args) {
        // to extract results from the streams. This is the main idea behind terminal operation.
        //collect()
        List<String> l = new ArrayList<>();
        l.add("Sayan Chatterjee");
        l.add("Chandrika Dey");
        l.add("Rina Dey");
        l.add("Anuska Chatterjee");
//        List<String> collectedList = l.stream().skip(1).map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(collectedList);
//        List<String> collectedList2 = l.stream().filter(x -> x.length() > 8).collect(Collectors.toList());
//        System.out.println(collectedList2);
        // foreach
//        l.stream().forEach(System.out::println);
        // reduce

        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6,7,8);
//        Optional<Integer> optional  = l2.stream().reduce((x, y) -> x + y);
//        System.out.println(optional.get());
//        // anymatch(),allMatch(),noneMatch()
//        boolean isAnyMatched = l2.stream().anyMatch(x -> x % 2 == 0);
//        boolean isAllMatched = l2.stream().allMatch(x -> x > 0);
//        boolean isNoneMatched = l2.stream().noneMatch(x -> x > 0);
//        System.out.println(isAnyMatched);
//        System.out.println(isAnyMatched);
//        System.out.println(isNoneMatched);

        l2.stream().findFirst().ifPresent(System.out::println);
        Optional<Integer> map1 = l2.stream().findFirst().map(x -> x + 10);
        System.out.println(map1.get());

        List<Integer> salary = Arrays.asList(100,200,3000,400,500);
        Integer secondLowestSalary = salary.stream().sorted().skip(1).findFirst().get();
        System.out.println(secondLowestSalary);

        // These all are short circuit operations. Once they find the item, the operation stops.


    }
}
