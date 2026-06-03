package may30;

public class PaymentMain {

    public static void main(String[] args) {
        Payment payment = new InteractPayment(10);
        payment.receipt();
        payment.pay();
    }
}
