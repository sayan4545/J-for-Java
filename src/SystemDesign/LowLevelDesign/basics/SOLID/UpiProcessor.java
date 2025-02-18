package SystemDesign.LowLevelDesign.basics.SOLID;

public class UpiProcessor extends PaymentProcessor{
    @Override
    public void processpayment(double amount) {
        System.out.println("Execuiting UPI payment : "+ amount);
    }
}
