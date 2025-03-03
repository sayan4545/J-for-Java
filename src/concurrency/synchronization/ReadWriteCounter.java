package concurrency.synchronization;

import java.util.Locale;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock WriteLock = lock.writeLock();
    private final Lock ReadLock = lock.readLock();
    /*
    ReadWriteLock allows multiple threads to read resources concurrently intill no thread is writing to it

     */
    public void increment(){
        WriteLock.lock();
        try{
            count++;
        }finally{
            WriteLock.unlock();
        }
    }
    public int getCount(){
        ReadLock.lock();
        try{
            return count;
        }finally{
            ReadLock.unlock();
        }
    }

}
