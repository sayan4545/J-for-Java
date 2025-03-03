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
}
