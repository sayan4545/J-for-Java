package OOPS;

public class InnerClassDemons {
    class A{
        String name;
        int age;
        A(String name,int age){
            this.name = name;
            this.age = age;
            System.out.println("Inside A");
        }
    }

    public static void main(String[] args) {
        InnerClassDemons obj1 = new InnerClassDemons();
        A obj2 = obj1.new A("S",34);
    }
}
