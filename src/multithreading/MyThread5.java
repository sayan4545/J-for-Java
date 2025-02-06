package multithreading;

public class MyThread5 extends Thread{
    public MyThread5(String name){
        super(name);
    }
    @Override
    public void run(){
        while(true){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5("Thread Chandrika: ");
        t1.setDaemon(true);
        t1.start();
        System.out.println("Main done!!");
    }
}
