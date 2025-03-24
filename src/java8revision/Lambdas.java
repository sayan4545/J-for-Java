package java8revision;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
//        F1 c = (()-> System.out.println("Hello"));
//        c.printName();
//        Thread t1 = new Thread(()-> System.out.println("Hello"));
//        t1.start();
//        MathOperation add = ((a,b)->a+b);
//        MathOperation sub = ((a,b)->a-b);
//        MathOperation mul = ((a,b)->a*b);
//        System.out.println(add.operate(3,4));
//        System.out.println(sub.operate(5,2));
//        System.out.println(mul.operate(7,8));
//
//
        // Predicate --> boolean valued functional interface , abstract method --> Test(T t)

//        Predicate<Integer> isEven = (a->a%2==0);
//        System.out.println(isEven.test(5));
//        System.out.println(isEven.test(8));


//        Predicate<String> isStartsWithA = (a->a.toLowerCase().startsWith("a"));
//        System.out.println(isStartsWithA.test("Anuska"));
//        Predicate<String> isGreaterThan = (a->a.toLowerCase().length()>4);
//        System.out.println(isGreaterThan.test("Chandrika"));
//        System.out.println(isGreaterThan.test("Rimi"));
//        System.out.println(isGreaterThan.test("Abbey"));
//        Predicate<String> andCondition = isGreaterThan.and(isStartsWithA);
//        System.out.println(andCondition.test("Ankit"));

        // Function --> R apply(T t)
        Function<Integer,Integer> doubleIt = ((a)->2*a);
        Function<Integer,Integer> trippleIt = ((a)->3*a);
        System.out.println(doubleIt.andThen(trippleIt).apply(5));
        Function<Integer,Integer> identity = Function.identity();
        System.out.println(identity.apply(5));

        Consumer<List<Integer>> consumeList = ((x)->{
            for(Integer i:x){
                System.out.print(i+" ");
            }
        });

        consumeList.accept(Arrays.asList(1,2,4,5,7,8,9));






    }
}
interface  MathOperation{
    public float operate(int a, int b);
}
