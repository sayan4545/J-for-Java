package java8.defautmethodsAndStaticMethods;

public interface I2 {
    default void m1(){
        System.out.println("Inside m1..");

    }
    static int population(){
        return 6756;
    }

}
