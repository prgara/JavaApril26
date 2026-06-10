package jun06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            int i = 10 / 0;
        }catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Finally executed");
        }

        System.out.println("Program ended");


        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Please enter a num : ");
            int x = scanner.nextInt();
            System.out.println(x);
        }



    }
}
