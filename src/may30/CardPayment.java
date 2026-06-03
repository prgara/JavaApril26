package may30;

public class CardPayment extends Payment{

    public CardPayment(double balance) {
        super(balance);
    }

    @Override
    void pay() {
        System.out.println("Payment done with credit card");
    }
}
