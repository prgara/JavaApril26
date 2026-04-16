package apr15;

public class UnaryOperators {


    public static void main(String[] args) {
        int x = 10;
        // post increment
        // use value first and then add 1 to it
        System.out.println(x--); // 10 print add by 1-11
        System.out.println(x);

        //pre-increment
        // add 1 first and then use the value
        System.out.println(--x);
    }
}
