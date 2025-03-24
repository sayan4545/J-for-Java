package streamsApi.java8lambdasAndMethodrefernce.defaultandStaticMethodsinInterface;

public class Test {
    public static void main(String[] args) {
        InterfaceOneimpl test1 = new InterfaceOneimpl();
        System.out.println(test1.add(7,8));
        test1.print();
        System.out.println(InterfaceOne.calculateDiff(8,7));
    }
}
