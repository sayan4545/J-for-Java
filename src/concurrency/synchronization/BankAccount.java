package concurrency.synchronization;

public class BankAccount {
    private int balance = 10000;
    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" "+" attempting withdrwal of : "+amount);
        if(balance>amount){
            System.out.println(Thread.currentThread().getName()+" Withdrwal succesfull"+ amount);
            try{
                Thread.sleep(5000);
            }catch(Exception e){
                e.printStackTrace();
            }
            balance = balance - amount;
            System.out.println("Remaioning balance is : "+ balance);
        }else{
            System.out.println(Thread.currentThread().getName()+" Insufficient balance");
        }

    }
}
