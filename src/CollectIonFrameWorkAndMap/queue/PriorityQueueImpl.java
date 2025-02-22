package CollectIonFrameWorkAndMap.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        // Orders elements based on their natural ordering.
        //custom comparator for customized oredreing.

        q1.add(100);
        q1.add(200);
        q1.add(300);
        q1.add(400);
        q1.add(500);
        q1.add(900);
        q1.add(700);
        System.out.println(q1);
//        System.out.println(q1.peek());
//        System.out.println(q1.poll());
        while(!q1.isEmpty()){
            System.out.println(q1.poll());
        }
        // internal working --> PriorityQueue is implemented by a min heap (natural ordering).
        //
    }
}
