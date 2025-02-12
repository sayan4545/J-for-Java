package java8features.functionalInterfaces;

public class Test{
    public static void main(String[] args) {
        F1 f1= ()->{
            System.out.println("Hello");
        };
        f1.printName();
    }
}
