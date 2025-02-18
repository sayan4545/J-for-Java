package SystemDesign.LowLevelDesign.basics.SOLID;

public class PaymentService {
    public void processOrder(PaymentProcessor paymentProcessor, double amount){
        paymentProcessor.processpayment(amount);
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        PaymentProcessor paymentProcessor = new CrediitCardProcessopr();
        PaymentProcessor paymentProcessor1 = new UpiProcessor();
        paymentService.processOrder(paymentProcessor,4000);
        paymentService.processOrder(paymentProcessor1,10000);
    }
}
