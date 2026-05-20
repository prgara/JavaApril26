package may19;

public class Main {
    int x = 10;

    public static void main(String[] args) {

//        String s = "hello";
//        String x = new String("hello");
//        String a = s.concat(" world");
//        System.out.println(s);
////        System.out.println(a);
//
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" World");
//        System.out.println(sb);
//
//
//        s.length();
//        char[] charArray = s.toCharArray();
//        for (char c : charArray){
//            System.out.println(c);
//        }
//        int length = charArray.length;


        String s = "hello"; // SCP - 1x0hb1
        String a = "hello"; // 1x0hb1
        String g = "hello";
        String b = new String("hello"); // 2cdbhj2
        String c = new String("hello"); // 3dgfv31
        String z = "world";
        int e = 10;
        int h = 10;
        System.out.println(e==h);
//        System.out.println(s == a); //true - false  - f
//        System.out.println(s == b); // false - true - f
//        System.out.println(b == c); // false - false - f
//        System.out.println(s == g);
//        System.out.println(a == g);
        System.out.println(s.equals(b)); // false - true -
        System.out.println(s.equals(z)); // false - true -
    }
}
