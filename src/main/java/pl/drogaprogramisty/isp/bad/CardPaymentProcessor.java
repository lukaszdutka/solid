package pl.drogaprogramisty.isp.bad;

public class CardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(Payment payment) {
        System.out.println("processing card payment...");
    }

    @Override
    public void refundPayment(Payment payment) {
        System.out.println("refunding card payment...");
    }

    @Override
    public void notifyPaymentFailure(Payment payment, String errorMessage) {
        System.out.println("error during card payment...");
        System.out.println(errorMessage);
    }

    @Override
    public void notifyPaymentSuccess(Payment payment) {
        System.out.println("card payment success...");
    }
}
