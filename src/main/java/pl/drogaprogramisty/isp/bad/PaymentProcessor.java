package pl.drogaprogramisty.isp.bad;

public interface PaymentProcessor {
    void processPayment(Payment payment);

    void refundPayment(Payment payment);

    public void notifyPaymentFailure(Payment payment, String errorMessage);

    public void notifyPaymentSuccess(Payment payment);
}
