package CollectIonFrameWorkAndMap.queue;

import java.util.LinkedList;

public class QueueImpl {
    public static void main(String[] args) {
        // A data structure that runs on FIFO principle.
        // FIFO --> First in First out.
        // Elements are added at the end and removed from the front.
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        System.out.println(list);

        Integer i = list.removeFirst();
        System.out.println(i);
        // Above a linkedlist is implemented as a queue.
    }
}
