package java8features;

public interface DefaultMethodsAndStaticMethodsInInterfaceImpl {
    void printName();
    int add(int a, int b);
    default String addString(String string){
        return "added string is : " + string;
    }
    static int population(){
        return 8;
    }
}
