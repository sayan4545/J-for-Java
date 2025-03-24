package streamsApi.java8lambdasAndMethodrefernce.defaultandStaticMethodsinInterface;

public class InterfaceOneimpl implements InterfaceOne{
    @Override
    public void print() {
        System.out.println("Inside interfaceOne");
    }

    @Override
    public void calculate() {
        System.out.println("Performing calculation");
    }

    @Override
    public int add(int a, int b) {
        return InterfaceOne.super.add(a, b);
    }
}
