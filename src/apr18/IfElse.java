package apr18;

public class IfElse {

    public static void main(String[] args) {


        int x = 99;
        if(x % 2 == 0){
//            System.out.println(x + " is even ");
        } else {
//            System.out.println(x + " is odd");
        }


        String s = x % 2 == 0 ? "even" : "odd";
        System.out.println(s);


        //        // if raining then carry umbrella
        boolean raining = true ;
        boolean sunny = false;
        boolean rainingHeavily = false;


        if(raining){
            if(rainingHeavily){
//                System.out.println("I will put on rain coat");
            }
//            System.out.println("Carry umbrella");
        } else if (sunny){
//            System.out.println("I will put on shades");
        } else {
//            System.out.println("I will stay home");
        }
    }
}
