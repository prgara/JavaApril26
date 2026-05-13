package may12;

public class CharArr {


    public static void main(String[] args) {
        int[] arr = new int[5];
        char[] charArr = new char[5];
        charArr[0] = 'H';
        charArr[1] = 'e';
        charArr[2] = 'l';
        charArr[3] = 'l';
        charArr[4] = 'o';
//        System.out.println(charArr);


        String s = "Hello";   // string literal
        String x = new String("Hello"); // using new keyword
        String y = "Hello";
        String a = "Hello";

//        System.out.println(s);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(a);


        System.out.println(s.indexOf('o'));
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(4));
//        char c = s.charAt(8);
        char[] charArray = s.toCharArray();
        System.out.println(s.substring(1,4)); // Hello
        System.out.println(s.compareTo("Hello"));




    }
}
