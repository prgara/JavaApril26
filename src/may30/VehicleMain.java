package may30;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        bike.move();
        car.move();
    }
}
