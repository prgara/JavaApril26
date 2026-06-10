package jun06;

import java.io.FileReader;

public class Bank {

    double balance;

    public double getBalance() {
        return balance;
    }

    void withdraw(int amount){ //500 //five hundred
        if (amount > balance){
            throw new InsufficientBalance("You dont have enough balance");
        }
        balance -= amount;
    }

    void deposit(int amount){
        balance += amount;
    }



}
