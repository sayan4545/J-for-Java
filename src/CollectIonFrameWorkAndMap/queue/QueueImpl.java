package CollectIonFrameWorkAndMap.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueImpl {
    public static void main(String[] args) {
        // A data structure that runs on FIFO principle.
        // FIFO --> First in First out.
        // Elements are added at the end and removed from the front.
//        LinkedList<Integer> list = new LinkedList<>();
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        System.out.println(list);
//
//        Integer i = list.removeFirst();
//        System.out.println(i);
        // Above a linkedlist is implemented as a queue.

//        Queue<Integer> q1 = new LinkedList<>();
//        q1.add(100);
//        q1.add(200);
//        q1.add(300);
//        q1.add(400);
//        q1.add(500);
//        q1.add(600);
//        System.out.println(q1);
//        // add,remove,poll,peek,element
//        Integer removed = q1.remove();
//        System.out.println(removed);
//        Integer polled = q1.poll();
//        System.out.println(polled);
//        Integer peeked = q1.peek();
//        System.out.println(peeked);
//        System.out.println(q1);
        // remove() throws exception. poll() donot throw exception.
        // element() throws exception if empty, peek() donot throw exception.
        Queue<Integer> q2 = new ArrayBlockingQueue<>(2);
        q2.add(100);
        q2.add(200);
        boolean isOffered = q2.offer(300);// returns a boolean value. either true or false.
        System.out.println(isOffered);
        System.out.println(q2);


    }
}
