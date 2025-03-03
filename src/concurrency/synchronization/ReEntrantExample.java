package concurrency.synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReEntrantExample {
    private final Lock lock = new ReentrantLock();

    public void OuterMethod() {
        lock.lock();
        try {
            System.out.println("Outer method");
            InnerMethod();

        }catch(Exception e){

        }finally{
            lock.unlock();
        }
    }
    public void InnerMethod(){
        lock.lock();
        try{
            System.out.println("Inner method");
        }finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReEntrantExample reEntrantExample = new ReEntrantExample();
        reEntrantExample.OuterMethod();
    }

}
