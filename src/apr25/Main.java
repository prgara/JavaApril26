package apr25;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //data type                 var name/ref                             value
        int                           x                  =                     1;

        //data type         var/ref                                value
        Scanner              scanner          =               new Scanner(System.in);
//       String s =  scanner.next();
//       int a =  scanner.nextInt();


       switch (x){
           case 1 :
               System.out.println(1);
               break;
           case 10:
               System.out.println(10);
               break;
           default:
               System.out.println("Nothing found");
       }



       // Advanced switch case java 14+
       switch (x){
           case 1 -> {
               System.out.println(1);
               System.out.println("hello");
           }
           case 10 -> System.out.println(10);
       }




    }
}
