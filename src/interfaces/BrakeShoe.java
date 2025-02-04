package interfaces;

public class BrakeShoe implements Brake{
    @Override
    public void brake() {
        System.out.println("Brakes");
    }
}
