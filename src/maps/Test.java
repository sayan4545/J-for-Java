package maps;

public class Test {
    public static void main(String[] args) {
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
    }
    public static int simpleHash(String key){
        int sum =0;
        for(char c: key.toCharArray()){
            sum = sum + c;
        }
        return sum;
    }
}
