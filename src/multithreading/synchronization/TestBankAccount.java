package multithreading.synchronization;

public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount(20000);
        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(10000);
            }
        };
        Thread t1 = new Thread(thread1,"Sayan");
        Thread t2 = new Thread(thread1,"Chandrika");
        t1.start();
        t2.start();

    }
}
