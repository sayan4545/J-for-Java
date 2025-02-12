package java8features.functionalInterfaces;

import static java.lang.System.out;

public class Test{
    public static void main(String[] args) {
//        F1 f1= ()->{
//            out.println("Hello");
//        };
//        f1.printName();
//        Calculate cc = (int a, int b, int c)->{;
//            return a+b+c;
//
//        };
//        Calculate cd = (int a , int b,int c)->  a+b+c;// more classy
//        Calculate xy = (c,d,e)->c*d*e;
//        System.out.println(cc.getClass().getName());
//        System.out.println(cd.getClass().getName());
//        System.out.println(xy.getClass().getName());
//        int add2 = cd.add(1,2,3);
//        int add = cc.add(8,9,10);
//        int prod = xy.add(3,4,5);
//        System.out.println(add +" "+add2);
//        System.out.println(prod);
//        ConvertToUpperCase lambda1 = (value)->value.toUpperCase();
//        String convertedValue = lambda1.convert("happy valentines day chandrika..");
//        out.println(convertedValue);
//        ConvertToUpperCase methodref1 = String::toUpperCase;
//        String converted2 = methodref1.convert("happy valentines day chandrika..");
//        out.println(converted2);

        String sayan = "Sayan";
        F1 a = out::println;
        a.printName("Sayan Chatterjee");
    }
}
