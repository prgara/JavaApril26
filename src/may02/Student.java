package may02;

public class Student {

    int id;    // instance variable
    String name;
    int marks;
    int printMarks;


    void setDetails(String inputName, int inputId,int inputMarks){
        id = inputId;
        name = inputName;
        marks = inputMarks;
    }

    void printDetails(){
        int marks = 89;
//        int id = 100;// local variable
        System.out.println("Student id is : "+id + " " +
                "and name is : " + name +" marks is :"+ marks);
    }

    int printMarks(){
        return marks;
    }


}
