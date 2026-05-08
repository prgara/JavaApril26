package may05;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,10};


        System.out.println("Before reverse array is ");
        for (int i : arr){
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(" ");
        System.out.println("After reverse array is ");

        for (int i : arr){
            System.out.print(i + " ");
        }

        for (int i = arr[arr.length-1]; i < arr.length; i--) {
            System.out.println(i);
        }


    }
}
