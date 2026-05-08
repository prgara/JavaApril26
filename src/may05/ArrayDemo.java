package may05;

import java.util.Scanner;

public class ArrayDemo {


    public static void main(String[] args) {
        //data type       ref var                        memory for 5 integers
        int[]                arr            =             new int[5];
        arr[0] = 19;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 41;
        arr[4] = 59;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[0]);

        int[] arr1 = {1,2,3,4,5,6,7,8};

//        System.out.println(arr1[6]);


        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
        }



        String[] names = {"John","Pooja","Mandeep"};

        for( String a : names){
            System.out.println(a);
        }

        
        String[] fruits = new String[10];
        int[] nums = new int[5];
        int x = nums[0];
        nums[1] = 20;
        fruits[4] = "Grapes";





























    }
}
