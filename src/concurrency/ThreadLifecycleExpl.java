package concurrency;

public class ThreadLifecycleExpl extends Thread{
    @Override
    public void run(){
        //System.out.println(Thread.currentThread().getState());
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);
        }catch(Exception e){
            e.printStackTrace();
        }
//        for(;;){
//            System.out.println(Thread.currentThread().getName());
//        }
    }

    /*
    The thread moves throgh different states throughout its execution. That is Thread lifecycle.
    1. New --> A thread is in this state when it is created but not started.
    2. Runnable --> After the run() method is called , the thread becomes runnable, it is ready to run
    and is waiting CPU time.
    3. Running --> The thread in this state is getting executed.
    4. Blocked/Waiting --> A thread is in this state when it is weaiting for a resiource aor another thread to perform sopmem actiopn
    5. Terminated --> A thread is in this state when it is finished executing.
     */
    public static void main(String[] args) {
        ThreadLifecycleExpl t1 = new ThreadLifecycleExpl();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());// state of t1 thread
        //System.out.println(Thread.currentThread().getState());// state of main thread
        //System.out.println(t1.getState());
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(t1.getState());
        try{
            t1.join();// join() --> The main thrtead waits for t1 to finish execution
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(t1.getState());// TERMINATED

        /*
        Thread vs Runnable -->
        Whenever there is a class that extends anothger class, we cant extend Thread class from that subclass.
        In that case implementing Runnable interface saves our day.
         */



    }
}
