package SystemDesign.LowLevelDesign.basics.SOLID;

public class Circle implements Shapes{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        System.out.println("The area of the circle is : " + (3.14*radius*radius));
        return (3.14*radius*radius);
    }
}
