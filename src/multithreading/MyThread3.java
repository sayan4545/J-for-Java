package multithreading;

public class MyThread3 extends Thread{
    public MyThread3(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            String a = "";
            for(int j=0;j<1000;j++){
                a+="a";
            }
            System.out.println(Thread.currentThread().getName()+"--priority--"+ Thread.currentThread().getPriority()+" "+ i);
            try{
                Thread.sleep(1000);

            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3("Thread Sayan");
        MyThread3 t2 = new MyThread3("Thread Chandrika");
        MyThread3 t3 = new MyThread3("Thread Rajdip");
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        t3.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
