package jun06;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.deposit(10000);
        try{
            bank.withdraw(15000);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(bank.getBalance());

        System.out.println("Bank system ended");
    }
}
