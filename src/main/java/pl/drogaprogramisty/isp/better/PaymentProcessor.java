package pl.drogaprogramisty.isp.better;

public interface PaymentProcessor {
    void processPayment(Payment payment);

    public void notifyPaymentFailure(Payment payment, String errorMessage);

    public void notifyPaymentSuccess(Payment payment);
}
