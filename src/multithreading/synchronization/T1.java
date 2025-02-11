package multithreading.synchronization;

public class T1 extends Thread{
    BankAccount bankAccount;
    public T1(BankAccount bankAccount, String name){
        super(name);
        this.bankAccount = bankAccount;
    }
    @Override
    public void run(){
        try{
            bankAccount.withdraw(10000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
