package java8.defautmethodsAndStaticMethods;

public class ClassOne implements I1{
    @Override
    public void printName() {
        m2();
        System.out.println("Sayan Chatterjee");
    }

    @Override
    public String getName() {
        m1();
        return "Sayan Chatterjee";
    }
}
