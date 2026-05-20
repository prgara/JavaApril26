package may19;

public class Test {
    public static void main(String[] args) {


        StringBuffer s = new StringBuffer("Hello");
        for (int i = 0; i < 100 ; i++) {
            s.append(i);
        }
    }
}
