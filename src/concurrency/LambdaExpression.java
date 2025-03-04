package concurrency;

public class LambdaExpression {
    public static void main(String[] args) {
        /*
        Functional interface --> The interface that contains only on absdtarct
        method is called functional interface.
         */
        Runnable task = ()-> System.out.println("Hello");
        Thread t1 = new Thread(task);
        Thread t2 =new Thread(()-> System.out.println("Hello2"));
        t1.start();
        t2.start();
    }
}
