package apr25;

public class DoWhileLoop {

    public static void main(String[] args) {

        int x = 1;
        do{
            if(x%2==0){
                System.out.println(x);
            }
            x++;
        } while (x <= 10);


        while(x <=10){
            System.out.println(x);
            x++;
        }
    }



}
