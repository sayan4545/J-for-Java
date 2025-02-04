package collectionFramework.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        for(int x:list){
            System.out.print(x+" ");
        }
       System.out.println();
//        List<String> list1 = Arrays.asList("Mon", "Tues", "Wed");
//        System.out.println(list1.getClass().getName());
//        List<Integer> list2 = List.of(1, 2, 3, 4);
//        System.out.println(list2.getClass().getName());
//        List<Integer> list3 = List.of(1,2,3,4);
//        List<Integer> list4 = new ArrayList<>();
//        list4.add(10);
//        list4.add(20);
//        list4.add(30);
//        list4.add(40);
//        System.out.println(list4.addAll(list3));
//        System.out.println(list4);
//        System.out.println(list4.getClass().getName());
//        Integer[] newList = list.toArray(new Integer[0]);
        List<String> newStringList = new ArrayList<>();
        newStringList.add("He");
        newStringList.add("Be");
        newStringList.add("Ce");
        newStringList.add("De");
        newStringList.add("fe");
        newStringList.add("Ge");
        System.out.println(newStringList);
        System.out.println(newStringList.hashCode());
        String[] nn = newStringList.toArray(new String[0]);
        System.out.println(nn.getClass().getName());
        System.out.println(nn.hashCode());
    }
}
