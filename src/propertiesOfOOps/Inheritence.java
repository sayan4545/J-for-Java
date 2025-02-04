package propertiesOfOOps;

public class Inheritence {
    public static void main(String[] args) {
//        Box b1 = new Box();
//        System.out.println(b1.l +" "+b1.w+" "+b1.h);
//        Box b2 = new Box(2,3,4);
//        System.out.println(b2.l +" "+b2.w+" "+b2.h);
//        Box b5 = new BoxWeight(1,2,3,4);
//        System.out.println(b5.h);
        //System.out.println(b5.weight);
//        BoxWeight b2 = new BoxWeight(2,3);
//        System.out.println(b2.l+" "+b2.w+" "+b2.weight);
//        BoxWeight b3 = new BoxWeight(b2);\
        BoxPrice b = new BoxPrice(1,2,3,4,5);
        BoxPrice c = new BoxPrice();
        BoxPrice d = new BoxPrice(b);
        System.out.println(b.h+" "+b.l+" "+b.w+b.weight+" "+b.price);


    }

}
