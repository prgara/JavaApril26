package may30;

public abstract class Payment {

     double balance;

    public Payment(double balance) {
        this.balance = balance;
    }



    void receipt(){ // concrete method
        System.out.println("Receipt generated for the payment");
    }

     abstract void pay(); // abstract method
}
