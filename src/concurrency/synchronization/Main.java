package concurrency.synchronization;

import accessmodifiers2.B;

public class Main {
    public static void main(String[] args) {
//        BankAccount sbiAccount = new BankAccount();
//        BankAccountWithLock sbiAccount2 = new BankAccountWithLock();
//        Runnable runnableTask = new Runnable() {
//            @Override
//            public void run() {
//                sbiAccount2.withdraw(300);
//            }
//        };
//        Thread t1 = new Thread(runnableTask,"t1");
//        Thread t2 = new Thread(runnableTask,"t2");
//        t1.start();
//        t2.start();
//        try{
//            t1.join();
//            t2.join();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        UnFairLockExample unFairLockExample = new UnFairLockExample();
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                unFairLockExample.access();
//            }
//        };
//        Thread t1 = new Thread(task,"t1");
//        Thread t2 = new Thread(task,"t2");
//        Thread t3 = new Thread(task,"t3");
//        t1.start();
//        t2.start();
//        t3.start();
        ReadWriteCounter readWriteCounter = new ReadWriteCounter();
        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println(Thread.currentThread().getName()+" read: "+readWriteCounter.getCount());
                }

            }
        };
        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    readWriteCounter.increment();
                    System.out.println(Thread.currentThread().getName()+" incremented");
                }
            }
        };

        Thread writerThread = new Thread(writeTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);
        writerThread.start();
        readerThread1.start();
        readerThread2.start();
        try{
            writerThread.join();
            readerThread1.join();
            readerThread2.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Final couint: "+ readWriteCounter.getCount());
    }
}
