package concurrency.threadCommuncation;
class SharedResource{
    private int data;
    private boolean hasdata;

    public synchronized void produce(int value){
        while(hasdata){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
        data = value;
        hasdata = true;
        System.out.println("Produced :"+ value);
        notify();

    }
    public synchronized int Consume(){
        while(!hasdata){
            try{
                wait();
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
        hasdata = false;
        System.out.println("Consumed: "+ data);
        notify();
        return data;

    }
}
class Producer implements Runnable{

    private SharedResource sharedResource;
    public Producer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            sharedResource.produce(i);

        }

    }
}
class Consumer implements Runnable{
    private SharedResource sharedResource;
    public Consumer(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            int value = sharedResource.Consume();

        }
    }
}
public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(new Producer(sharedResource),"Thread 1");
        Thread t2 = new Thread(new Consumer(sharedResource),"Thread 2");
        t1.start();
        t2.start();
    }
}
