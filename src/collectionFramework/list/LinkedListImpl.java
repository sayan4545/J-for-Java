package collectionFramework.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(12);
        linkedList.add(14);
        linkedList.add(17);
        System.out.println(linkedList);
        linkedList.addFirst(1);
        linkedList.addLast(0);
        linkedList.addAll(linkedList);
        System.out.println(linkedList);
        linkedList.removeIf((a->a%2==0));
        System.out.println(linkedList);
        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","mouse","human","Dog","Elephant"));
        System.out.println(animals);
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("cat","Dog"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }

}
