package OOPS;

public class Main {
    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        System.out.println(obj);
        System.out.println(obj2);
        System.out.println(obj==obj2);

    }
}

