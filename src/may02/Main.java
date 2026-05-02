package may02;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "";
        s1.setDetails("John",8,89);
//        s1.id = 1;
//        s1.name = "John";
        System.out.println(s1.printMarks());
        s1.printDetails();


    }
}
