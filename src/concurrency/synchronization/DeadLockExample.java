package concurrency.synchronization;
class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper){
        System.out.println(Thread.currentThread().getName()+" is using pen"+ this+ paper);
        paper.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finsihed using pen "+ this);
    }
}
class Paper {
    public synchronized  void writeUsingPenAndPaper(concurrency.synchronization.Pen pen){
        System.out.println(Thread.currentThread().getName()+" is using paper"+ this +" and trying to get pen");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finsihed using paper"+ this);
    }
}
class Task1 implements Runnable{
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen,Paper paper){
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        pen.writeWithPenAndPaper(paper);

    }
}
class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {

        paper.writeUsingPenAndPaper(pen);

    }
}
public class DeadLockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();
        Thread t1 = new Thread(new Task1(pen,paper),"t1");
        Thread t2 = new Thread(new Task2(pen,paper),"t2");
        t1.start();
        t2.start();
    }
}





