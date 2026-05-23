package may23;

public class Car  {

    Engine engine;

    public void drive(){
        engine.start();
        System.out.println("Car is moving");
    }


    public static void main(String[] args) {
        Car car = new Car();
        car .drive();
    }
}
