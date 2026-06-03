package may30;

public class InteractPayment extends Payment{

    public InteractPayment(double balance) {
        super(balance);
    }

    @Override
    void pay() {
        System.out.println("Payment done via interact method");
    }
}
