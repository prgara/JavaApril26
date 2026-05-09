package may09;

public class ArrayProbs {
    public static void main(String[] args) {
        int[][] marks = {
                {1,2,3,4},
                {5,6,7,8},
                {2,5,4,3},
                {2,2,2,1}
        };

        System.out.println("Highest marks of each student");

        for (int i = 0; i < marks.length; i++) { // rows
            int highest = marks[i][0];
            for (int j = 0; j < marks[i].length; j++) {
                if(marks[i][j] > highest){
                    highest = marks[i][j];
                }
            }
            System.out.println("Student "+ (i)+ " highest marks " +highest);
        }


        System.out.println("Average marks");

        for (int i = 0; i < marks[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < marks.length; j++) {
                sum= sum + marks[j][i];
            }
            double avg = (double) sum/ marks.length;
            System.out.println(avg);
        }


        int highestTotal = 0;
        int topped = 0;

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total = total + marks[i][j];
            }
            System.out.println("Student "+ i + " total is "+ total);

            if(total >highestTotal){
                highestTotal = total;
                topped = i;
            }
        }
        System.out.println("Topper is : " + topped);
    }

}
