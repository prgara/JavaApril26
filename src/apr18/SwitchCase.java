package apr18;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int            x =              100;
        Scanner       scanner =              new Scanner(System.in);
        System.out.println("Please enter a day: ");
        String day = scanner.next();


//        String day = "Monday";
        switch (day){
            case "Monday":
                System.out.println("Today is Monday");
                break;
            case "Sunday":
                System.out.println("Today is Sunday");
                break;
            case "Wednesday":
                System.out.println("Today is wednesday");
                break;
            default:
                System.out.print("today is holiday");

        }




    }
}
