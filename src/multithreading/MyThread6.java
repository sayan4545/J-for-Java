package multithreading;

public class MyThread6 extends Thread{
    public MyThread6(String name){
        super(name);
    }
    @Override
    public void run(){

        for(int i=0;i<1000000;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }


    public static void main(String[] args) throws Exception {
        MyThread6 t1 = new MyThread6("Thread: Sayan");
        MyThread7 t2 = new MyThread7("Thread Chandrika");
        t1.setDaemon(true);
        t1.start();
        //t1.join();
        t2.start();
        System.out.println("Main done..");
    }
}
