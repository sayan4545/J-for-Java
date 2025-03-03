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
        UnFairLockExample unFairLockExample = new UnFairLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                unFairLockExample.access();
            }
        };
        Thread t1 = new Thread(task,"t1");
        Thread t2 = new Thread(task,"t2");
        Thread t3 = new Thread(task,"t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
