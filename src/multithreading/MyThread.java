package multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        System.out.println(obj.getState());
        obj.start();
        System.out.println(obj.getState());
        System.out.println(Thread.currentThread().getState());
        try {
            Thread.sleep(100);
            System.out.println(obj.getState());
            obj.join();
            System.out.println(obj.getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
