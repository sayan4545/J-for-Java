package multithreading.synchronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;
    public BankAccount(int balance){
        this.balance = balance;

    }
    private final Lock lock = new ReentrantLock();

    public  void withdraw(int amount){
        try{
            if(lock.tryLock(10000, TimeUnit.MILLISECONDS)) {
                if (amount > balance) {
                    System.out.println(Thread.currentThread().getName() + " INSUFFICIENT BALANCE");
                } else {
                    try {
                        System.out.println(Thread.currentThread().getName() + " performing");
                        try {
                            Thread.sleep(6000);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + " amount withdrwan" + amount);
                        System.out.println("remaining balance: " + (balance - amount));
                        balance = balance - amount;


                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }
            }
            else {
                System.out.println(Thread.currentThread().getName() +" locked , cant access now..");
            }
        }catch(Exception e){
            e.printStackTrace();;
        }
        finally{
            lock.unlock();

        }
    }
}
