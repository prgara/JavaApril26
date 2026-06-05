//package jun02;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//public class Exceptiondemo {
//
//// primitive data types - int, char, double
//    // collections  - objects - Integer, Double, Char
//    public static void main(String[] args) {
//        Account account = new Account();
//        String input ="1000"; //"One thousand" convert string to int
//        try {
//            int amount = Integer.parseInt(input); // 1000
//            account.withdraw(amount);
//        } catch (NumberFormatException e){
//            System.out.println("Please enter a valid number");
////        } catch (InsufficientException e) {
//            System.out.println("You dont have sufficient balance to withdraw");
//        } catch (NullPointerException e){
//            System.out.println("Null pointer ");
//        } catch (Exception e){
//            System.out.println("Something went wrong");
//        }
//
//        try {
//            // db operation
//        } catch (SQLException e){
////            reconnectDB();
//        } catch (IOException e){
//            // read from backup file
//        }
//
//    }
//}
//
//// nullpointer
//// Insufficientbalance
//// Numberformatexception
//class Account{
//
//    void withdraw(int amount){
//
//    }
//}