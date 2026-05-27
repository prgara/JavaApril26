package may26;

public class Account {


    double balance;



    void withdraw(int amount){
        A a = new A();
        balance = balance - amount;
    }

    void deposit(int amount){
        balance = balance + amount;
    }
}
