package pl.drogaprogramisty.isp.better;

public class BlikPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Payment payment) {
        System.out.println("processing blik payment...");
    }

    @Override
    public void notifyPaymentFailure(Payment payment, String errorMessage) {
        System.out.println("error during blik payment...");
        System.out.println(errorMessage);
    }

    @Override
    public void notifyPaymentSuccess(Payment payment) {
        System.out.println("blik payment success...");
    }
}
