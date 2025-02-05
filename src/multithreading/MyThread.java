package multithreading;

public class MyThread extends Thread{
    @Override
    public void run() {

    }

    public static void main(String[] args) {
        MyThread obj = new MyThread();
        System.out.println(obj.getState());
    }
}
