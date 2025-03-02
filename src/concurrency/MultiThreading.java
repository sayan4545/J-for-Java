package concurrency;

public class MultiThreading {
    /*
    In java multithreading is the concurrent execution of two or more threads to maximize the utilization of CPU.
    multithreading capabilities are part of java.lang package.

    In a single core environment the multithreading is handled by jvm and OS that switch between threads to
    give an illusion of concurrency.
    The threads share single core, time slicing is utilized to manage the thread execution.

    For multi core environments, JVM distruibutes the threads to execute true parallel execution
    of threads

    When a program starts, one thread starts running immediately that is called the
    main thread. This thread is rsponsible for execution of the main
    method



     */
    public static void main(String[] args) {
        System.out.println("Thread is running");
        System.out.println(Thread.currentThread().getName());
        /*
        To create a new thread , either you have to extend the Thread class or
        implement the Runnable interface.
         */
//        World world = new World();
//        world.start();
//        for(;;){
//            System.out.println(Thread.currentThread().getName());
//        }
        /*
        A new class World is created that extends the Thread class .
        The run() is overridden to constitute the code that constitutes the new
        thread
        start() is called to initiate the new thread
         */
        /*
        To implement teh runnable interface we created a new class World2. World2 implemets the Runnable interface
        A Thread object is created and an object of the World2 class i passed to it. start()
        method is called to initiate the Thread.

        In both the methods, the run() contains the code that will be executed when the thread is initiated.
         */
        World2 world2 =  new World2();
        Thread t1 = new Thread(world2);
        t1.start();
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}
