package may09;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        int[][] student = new int[3][3];
        student[0][0] = 98;
        student[0][1] = 99;
        student[0][2] = 97;
        student[1][0] = 99;
        student[1][1] = 91;
        student[1][2] = 90;
        student[2][0] = 89;
        student[2][1] = 72;
        student[2][2] = 85;

        System.out.println("Pooja marks in chemistry is : "+student[2][1]);
        System.out.println("Ram marks in math is : "+student[0][2]);


        int[][] marks = {
                {98,99,97}, // ram
                {99,91,90}, // sham
                {89,72,85}, // pooja
                {78,76,89}
        };
//        System.out.println( marks[1][0]);

        for (int i = 0; i < marks.length; i++) { // rows
            for (int j = 0; j < marks[i].length; j++) {  // column
//                System.out.print(marks[i][j] + " ");
            }
//            System.out.println();
        }

        for (int[] stu:marks){
            for (int mark:stu){
                System.out.print(mark+" ");
            }
            System.out.println();
        }



    }
}
