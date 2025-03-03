package concurrency.synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread("t1",counter);
        MyThread t2 = new MyThread("t2",counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
    /*
    Locking --> Intrinsic and Extrinsic . Intrinsic locking is there in every object.
    Whenever we use the synchronized() keyword, we make use of this intrinsic locks.

    Extrinsic locking --> These are more advanced set of locks, that we can control, when to lock and where to lock.

     */
}
