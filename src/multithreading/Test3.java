package multithreading;

public class Test3 implements Runnable{
    @Override
    public void run() {
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
