package multithreading;



public class Test {
    public static void main(String[] args) {
        Test2  obj = new Test2();
        obj.start();
//        System.out.println("Started Multithreading in java..");
//        System.out.println(Thread.currentThread().getName());
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }


    }
}
