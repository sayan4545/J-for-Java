package java8.defautmethodsAndStaticMethods;

class Test{
    public static void main(String[] args) {
//        ClassOne one = new ClassOne();
//        one.m1();
//        System.out.println(one.m2());
//        one.printName();
//        System.out.println(one.getName());
        ClassTwo c2 = new ClassTwo();
        c2.m1();
        c2.m1();
        int population = I2.population();
        System.out.println(population);
    }

}