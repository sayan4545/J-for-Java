package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
//        Thread t1 = new Thread(()->
//                System.out.println("Thread 1"));
//
//        Calculate add = (a,b)->a+b;
//        Calculate sub = (a,b)->Math.abs(a-b);
//        Calculate prod =(a,b)->a*b;
//        Calculate rem = (a,b)->a%b;
//        System.out.println(add.cal(1,2));
//        System.out.println(sub.cal(1,2));
//        Predicate<Integer> isOdd = (a)->a%2!=0;
//        System.out.println(isOdd.test(6));
//        System.out.println(isOdd.test(7));
//        Function<Integer,Integer> doubleIt = a ->a*2;
//        Function<Integer,Integer> tripleIt = a->a*3;
//        int res = doubleIt.apply(3);
//        System.out.println(res);
//        int finalans = doubleIt.andThen(tripleIt).apply(4);
//        System.out.println(finalans);
//
//        int composeAns = doubleIt.compose(tripleIt).apply(6);
//        System.out.println(composeAns);
//
//        Consumer<Integer> consume = a-> System.out.println(a);
//        Consumer<Integer> consume2 = a-> System.out.println(a*2);
//        //consume.accept(4);
//        consume.andThen(consume2).accept(5);

        Consumer<List<Integer>> printList = (l)->{
            for(int i: l){
                System.out.print(i+" ");
            }
        };
        printList.accept(List.of(1,2,3,4,5,6,7,8));
        System.out.println();
        Supplier<String> getHelloWorld = ()->"Hello World";
        System.out.println(getHelloWorld.get());

        Predicate<Integer> isEven = x->x%2==0;
        Function<Integer,Integer> square = x->x*x;
        Consumer<Integer> consume = x-> System.out.println(x);
        Supplier<Integer> supply = ()->10;

        if(isEven.test(supply.get())) consume.accept(square.apply(supply.get()));
        //BiPredicate,BiConsumer,BiFunction
        BiPredicate<Integer,Integer> isSumEven = (a,b)->(a+b)%2==0;
        System.out.println(isSumEven.test(4,5));//false;
        System.out.println(isSumEven.test(6,8));//true
        BiFunction<Integer,Integer,Integer> prodOfTwo = (a,b)->a*b;
        BiConsumer<Integer,String> toStringof = (a,b)->System.out.println(a+" "+b);
        toStringof.accept(45,"Sayan");


        List<String> people = Arrays.asList("Sayan", "Chandrika", "Rina");
        people.forEach(System.out::println);//using method reference
        people.forEach(x-> System.out.print(x+" ")); //using lambda expression


    }
}
