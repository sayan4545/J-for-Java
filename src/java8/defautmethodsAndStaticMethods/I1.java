package java8.defautmethodsAndStaticMethods;

public interface I1 {
    void printName();
    String getName();

    default void m1(){
        System.out.println("Inside m1..");
    }
    default String m2(){
        return "Inside m2..";
    }
}
