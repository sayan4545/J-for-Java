package propertiesOfOOps;

public class Box{
    double l;
    double h;
    double w;
    Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l,double h,double w){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    
}
