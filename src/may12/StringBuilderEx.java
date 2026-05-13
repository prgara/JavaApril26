package may12;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");

        StringBuffer stringBuffer = new StringBuffer("String ");
        stringBuffer.append("buffer");
//        System.out.println(stringBuffer);


        String s = "Hello";
        String concat = s.concat(" World");

        String x = new String("hello");
        String world = x.concat("World");
        System.out.println(world);
//        System.out.println(x); // hello world
//        System.out.println(concat); // hello
//        System.out.println(sb); // hello world


    }
}
