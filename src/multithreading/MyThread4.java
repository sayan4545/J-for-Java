package multithreading;

public class MyThread4 extends Thread{
    public MyThread4(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread4 t1 = new MyThread4("Thread 1");
        MyThread4 t2 = new MyThread4("Thread 2");
        t1.start();
        t2.start();
    }
}
