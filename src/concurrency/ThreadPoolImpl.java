package concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolImpl {
    /*
    Thread pool --> Collection of pre initialized threads.
    Why? --> Creation and dsetruction of threads is expensive.
    Response time increases.
    Control over thread count.
    Executers framework --> It came in java 5. simplifies the development of concurrent applications
    by absrtracting away many of the complexities that comes with creating and managing threads.

    Executer framework has three core interfaces --> Executer, ExectureSerice,ScheduledExecuterService

     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //Thread[] threads = new Thread[10];
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for(int i=1;i<=10;i++){
            int finalI = i;
            executor.submit(()->{
                int result = factorial(finalI);
                System.out.println(result);
            });
//            System.out.println(factorial(i));
            //thread.start();
            //threads[i-1].start();

        }
        executor.shutdown();
        try{
            executor.awaitTermination(100, TimeUnit.SECONDS);

        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
//        for(Thread thread:threads){
//            try{
//                thread.join();
//            }catch(Exception e){
//                Thread.currentThread().interrupt();
//            }
//        }

        System.out.println("Time taken to complete : "+ (System.currentTimeMillis()-startTime));

    }
    public static int factorial(int n){
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
        int result = 1;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        return result;
    }
}
