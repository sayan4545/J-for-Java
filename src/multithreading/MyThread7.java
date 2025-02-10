package multithreading;

public class MyThread7 extends Thread{
    public MyThread7(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
