package java8features;

public class A implements DefaultMethodsAndStaticMethodsInInterfaceImpl{

    @Override
    public void printName() {
        System.out.println("Sayan");

    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String addString(String string) {
        return DefaultMethodsAndStaticMethodsInInterfaceImpl.super.addString(string);
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(2,3));
        a.printName();
        System.out.println(a.addString("Chandrika"));
        DefaultMethodsAndStaticMethodsInInterfaceImpl d = new A();
        System.out.println(DefaultMethodsAndStaticMethodsInInterfaceImpl.population());
    }
}
