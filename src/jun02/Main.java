package jun02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {


    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.toUpperCase());
        } catch (NullPointerException e){
            System.out.println("arithmetic exception");
        } finally {
            //db connection closed logic
            // close file
            // releasing the resources
            System.out.println("Finally block exceuted");
        }
////        int a = 10/0;
////        System.out.println(a);
        System.out.println("hello world");
//
////        FileReader fileReader = new FileReader("xyz.txt");
//
//        try {
//            Thread.sleep(9000);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        try{
            int f = 10/0;
        } finally {
            System.out.println("Finally");
        }

    }
}