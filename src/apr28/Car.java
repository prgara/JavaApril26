package apr28;

public class Car {

    String color;
    String brand;
    int speed;
    int model;
    int price;


   public void drive(){
       System.out.println("I am driving the car");
   }

   public void stop(){
       System.out.println("car is stopped");
   }

   public void horn(){
       System.out.println("Car is honking");
   }


   public int currentCarSpeed(){
       return 100;
   }


}
