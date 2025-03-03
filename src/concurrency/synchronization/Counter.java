package concurrency.synchronization;

public class Counter {
    int count;
    public void increment(){
        synchronized (this){
            count++;
        }
    }
    public int getCount(){
        return this.count;
    }
}
