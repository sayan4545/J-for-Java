package propertiesOfOOps;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(){
        super();
        this.price = -1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.price = other.price;
    }
    BoxPrice(double l,double h,double w,double weight, double price){
        super(l,w,h,weight);
        this.price = price;
    }
}
