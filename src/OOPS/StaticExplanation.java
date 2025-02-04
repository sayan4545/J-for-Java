package OOPS;



public class StaticExplanation {
    public static void main(String[] args) {
        StaticExplanation s = new StaticExplanation();
        s.greeting();;
        greeting("Sayan");
    }
    void foo(){
        System.out.println("foo!");
    }
    void greeting(){
        System.out.println("Greet!!");
        foo();// this can happen, because at the end, an object will call greeting!!

        //greeting("Sayan");
    }
    static void greeting(String name){
        StaticExplanation s1 = new StaticExplanation();
        s1.greeting();

        System.out.println("Greetings!!" + name);

    }
}
