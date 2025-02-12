package java8features.functionalInterfaces;

public class Test{
    public static void main(String[] args) {
        F1 f1= ()->{
            System.out.println("Hello");
        };
        f1.printName();
        Calculate cc = (int a, int b, int c)->{;
            return a+b+c;

        };
        int add = cc.add(8,9,10);
        System.out.println(add);
    }
}
