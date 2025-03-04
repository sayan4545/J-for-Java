package concurrency.threadCommuncation;

public class Test {
    /*
    In a multi threaded environment, threads often need to communicate with each other to
    accomplish a task.
    Withot proper communications, threads may remain at inefficient busy waiting states,
    leading to high CPU wastage and deadlocks

    methods for inter thread communications:
    1. wait()  --> tells the current thread to wait and release the lock until the next thread uses the notify() a=or notiFyAll().
    2. notify() --> wakes up a single thread that is waiting
    3. notifyAll() --> wakes up all the threads that are waiting.

    these methods can only be called within a synchronized context.
     */
}
