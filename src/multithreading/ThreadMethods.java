package multithreading;

public class ThreadMethods extends Thread{
    @Override
    public void run(){
        System.out.println("Running this method..");
    }

    public static void main(String[] args) {
        ThreadMethods t1 = new ThreadMethods();
        t1.start(); // JVM executes the run() of the class .
    }
}
