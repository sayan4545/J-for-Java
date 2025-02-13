package java8features.streams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->
                System.out.println("Thread 1"));

        Calculate add = (a,b)->a+b;
        Calculate sub = (a,b)->Math.abs(a-b);
        Calculate prod =(a,b)->a*b;
        Calculate rem = (a,b)->a%b;
        System.out.println(add.cal(1,2));
        System.out.println(sub.cal(1,2));
        Predicate<Integer> isOdd = (a)->a%2!=0;
        System.out.println(isOdd.test(6));
        System.out.println(isOdd.test(7));
        Function<Integer,Integer> doubleIt = a ->a*2;
        Function<Integer,Integer> tripleIt = a->a*3;
        int res = doubleIt.apply(3);
        System.out.println(res);
        int finalans = doubleIt.andThen(tripleIt).apply(4);
        System.out.println(finalans);

        int composeAns = doubleIt.compose(tripleIt).apply(6);
        System.out.println(composeAns);

        Consumer<Integer> consume = a-> System.out.println(a);
        Consumer<Integer> consume2 = a-> System.out.println(a*2);
        //consume.accept(4);
        consume.andThen(consume2).accept(5);
    }
}
