package CollectIonFrameWorkAndMap.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeImpl {
    public static void main(String[] args) {
        // Deque --> double ended queue. It allow3s insertion and deletion
        // at the both ends.
        // versatile than regular queues and stacks since it can perform operations of both.
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new LinkedList<>();
        deque1.addFirst(100);
        deque1.addLast(200);
        deque1.offerFirst(1);
        deque1.offerLast(2);
        System.out.println(deque1);
        System.out.println(deque1.peekFirst());
        System.out.println(deque1.peek());
    }
}
