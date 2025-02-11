package multithreading.synchronization;

public class T2 extends Thread{
    BankAccount bankAccount;
    public T2(BankAccount bankAccount, String name){
        super(name);
        this.bankAccount = bankAccount;

    }
    @Override
    public void run(){
        try{
            bankAccount.withdraw(500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
