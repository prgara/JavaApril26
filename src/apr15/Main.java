package apr15;

public class Main {

    public static void main(String[] args) {

      // Declartaion (creating a box)

        int x;

        // Initialisation (putting the data inside the box)

        x = 10;


        int y = 20;

        int _x= 30;
        byte b = 10;
        //data type            var name         assignment opt              value
        short                    s                    =                      3000;
        float abc = 3.14f;
        double d = 3.14;

        long l = 10000L;

        char a = 'A';
        boolean g = false;
        System.out.println(g);
        System.out.println(abc);
        System.out.println(l);
//        System.out.println(y);


        // Small -> large Widening automatic
        int num = 42;
        double num1 = num;
        System.out.println(num1);


        // Manual Large -> Small Narrowing
        double abcd = 9.99;
        int i = (int) abcd;
        System.out.println(i);

    }

}

