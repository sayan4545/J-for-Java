package streamsApi.java8lambdasAndMethodrefernce.defaultandStaticMethodsinInterface;

public interface InterfaceOne {

    void print();
    void calculate();

    // Before java 8, intefaces could hold only abstract methods.
    // Any number of abstract methods are allowed in the interface. Any number
    //of default methods are also allowed in the intercface
    // to declare a default method , just add a default keyword in front of the method
    default int add(int a, int b){
        return a + b;
    }
    static int calculateDiff(int a, int b){
        return a-b;
    }
}
