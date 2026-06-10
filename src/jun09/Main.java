package jun09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        int x = 10;
        Integer a = x; // boxing

        Integer obj = Integer.valueOf(100);
        int prim = obj; // unboxing


        ArrayList<String> ar = new ArrayList<>();
        ar.add("Pragra");


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ram",1));
        students.add(new Student("Sham",2));
        students.add(new Student("Tom",3));
        students.add(new Student("Harry",4));
        students.add(new Student("Ron",5));


        for(Student stu:students){
//            System.out.println(stu.getRollno() + "->" + stu.getName());
        }


        String s = "Hello";
        System.out.println(s.toUpperCase()); // will not change s
        System.out.println(s);

//        System.out.println(students);

        Employee emp = new Employee("Ram",9087);
        System.out.println(emp);


    }
}
