package concurrency.synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountWithLock {
    private int balance = 10000;
    private Lock lock = new ReentrantLock();
    public void withdraw(int amount){
        try{
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){
                try{
                    if(balance>amount){
                        System.out.println(Thread.currentThread().getName()+" starting wiothdrwal"+ amount);
                        Thread.sleep(3000);
                        balance = balance - amount;
                        System.out.println(Thread.currentThread().getName()+" withdrwal succesfull"+ amount);
                        System.out.println("balance remaining: "+ balance);
                    }
                    else{
                        System.out.println(Thread.currentThread().getName()+" Insufficient balance");
                    }
                }catch(Exception e){
                    Thread.currentThread().interrupt();
                }
                finally {
                    lock.unlock();
                }
            }else{
                System.out.println(Thread.currentThread().getName()+" "+"Couldnot aquire the lock, will try again later");

            }
        }catch(Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
