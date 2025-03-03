package concurrency.synchronization;

public class DeadLockTut {
    /*
    DeadLock is a situation in multithreading where two or more locks are blocked forever , waiting for
    eachother to release resource. This typically happens when two or more threads have circular dependency
    on a set of locks.
    Deadlock occurs for these reasons:
    1. Mutual exclusion : Only one thread can access resource at a time
    2. Hold and Wait : A thread holding atleast one resource is waiting to acquire addituional resources
    hekld by opther threads
    3. No preemption : Resouirces cant be forcibly taken from threads holding them'
    4. Circular wait: A set of threads waiting for each other in a circular chain.
     */
}
