package SystemDesign.LowLevelDesign.basics.SOLID;

public class CrediitCardProcessopr extends PaymentProcessor{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing credit card payments: "+ amount);
    }
}
