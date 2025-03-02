package concurrency;

public class ThreadMethods extends Thread{
    public ThreadMethods(String name){
        super(name);
    }
    /*
    1. start() --> JVM runs the run method.
    2. sleep() --> JVM pauses the operation for the specified time.
    3. run() --> This is a overriden method.
    4. join() --> The caller thread waits for the thread to finish executing.
    5. setPriority() --> gives hiont to the jvm to prioritize multiple running threads.
    6. interrupt() --> interrupts the current flow.
     */
    @Override
    public void run(){
        try{
            Thread.sleep(1000);

        }catch(Exception e){
            System.out.println("Thread interrupted "+ e);
        }
//        for(int i=0;i<5;i++){
//            String a = "";
//            for(int j=0;j<10000;j++){
//                a = a +j;
//            }
//            try{
//                Thread.sleep(2000);
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName()+" priority--"+ Thread.currentThread().getPriority()+" count: "+ i);
//        }
    }

    public static void main(String[] args) {
        ThreadMethods t1 = new ThreadMethods("MAX");
        ThreadMethods t2 = new ThreadMethods("NORM");
        ThreadMethods t3 = new ThreadMethods("MIN");
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MIN_PRIORITY);
        t1.start();
        t1.interrupt();
        //t2.start();
        //t3.start();
//        try{
//            t1.join();
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("Hello");
    }
}
