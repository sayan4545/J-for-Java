package basics;

public class Add {
    public static void main(String[] args) {
        int a = 23;
        int b = 56;
        int sum = add2nums(a,b);
        System.out.println(sum);
    }
    public static int add2nums(int a, int b){
        return a +b;
    }
}
