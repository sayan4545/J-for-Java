package OOPS;

public class X implements Human{
    @Override
    public void eats() {
        System.out.println("Eats");
    }

    @Override
    public void sleeps() {
        System.out.println("Sleeps");
    }

    @Override
    public void haveFun() {
        System.out.println("Having Fun!");
    }
    String name;
    X(String name){
        this.name = name;
    }
}
class Y implements Human{

    @Override
    public void eats() {
        System.out.println("Eats!");
    }

    @Override
    public void sleeps() {
        System.out.println("Sleeps!");
    }

    @Override
    public void haveFun() {
        System.out.println("Have Fun !");
    }
}
class Z{
    public static void main(String[] args) {
        X x = new X("Sayan");
        Y y = new Y();
        System.out.println(x.name +" "+y.name);
    }
}
