package apr18;

public class LogicalOpt {

    public static void main(String[] args) {
        int x = 100;
        int y = 90;


        boolean a = x < y; // F
        boolean b = x > y; // T

        System.out.println(a && b); // F AND T -> F
        System.out.println(a || b); // F OR T ->  T

        System.out.println(!a);
        System.out.println(!b);
    }
}
