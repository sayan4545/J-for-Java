package collectionFrameworkNew;

import java.util.LinkedList;
import java.util.List;

public class LinkedListImpl {
    public static void main(String[] args) {
        List<Integer> ll1 = new LinkedList<>();
        ll1.add(78);
        ll1.add(79);
        ll1.add(80);
        ll1.add(89);
        System.out.println(ll1);
        ll1.addFirst(1);
        ll1.addLast(100);
        List<Integer> llModified = ll1.stream().map(x -> x * 2).toList();
        System.out.println(ll1);
        System.out.println(llModified);
    }
}
