package multithreading;

public class ThreadMethods extends Thread{
    @Override
    public void run(){
        //System.out.println("Running this method..");
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadMethods t1 = new ThreadMethods();
        t1.start(); // JVM executes the run() of the class .
    }
}
