package apr25;

public class SumOfDigits {

    public static void main(String[] args) {
        /* 123 -> 6
        var = 3+2+1 = 6
        loop [
        123 % 10 = 3
        123/10 = 12

        12%10 = 2
        12/10 = 1

        1%10 = 1
        ]


         */
        int x = 23347232;
        int sum = 0;

        while (x > 0){
          sum = sum +  x%10;
          x = x/10;
        }
        System.out.println(sum);

    }
}
