package java8.defautmethodsAndStaticMethods;

public interface MobileFunctionaLities {
    public void text();
    public void useInternet();
    public boolean isDualSim();
    public boolean isAndroid();
    public boolean is5Genabled();
    public static String brand(){
        return "From the house of Nokia";
    }
    default void call(){
        System.out.println("Calling enabled !!");
    }

}
