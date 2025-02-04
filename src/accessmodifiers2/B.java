package accessmodifiers2;

import accessmodifiers.A;

public class B extends A{

    public B(String name, int a) {
        super(name, a);
    }

    public static void main(String[] args) {
        B b = new B("Sayan",67);
        String a = b.name;

    }

}
