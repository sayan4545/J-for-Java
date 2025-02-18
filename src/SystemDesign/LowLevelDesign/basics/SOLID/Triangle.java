package SystemDesign.LowLevelDesign.basics.SOLID;

public class Triangle implements Shapes {
    private int height;
    private int base;
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double area() {
        System.out.println("The area of the triangle is : "+ (0.5*base*height));
        return (0.5*height*base);
    }
}
