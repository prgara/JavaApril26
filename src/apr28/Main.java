package apr28;

public class Main {


    public static void main(String[] args) {
        int x = 10;
        Car ford = new Car(); // object of a ford
        ford.brand = "Ford";
        ford.color = "Black";
        ford.speed = 90;
        ford.model = 2026;
        ford.price = 50000;
        ford.drive();
        System.out.println("Ford current speed is : "+ ford.currentCarSpeed());

        System.out.println("Car brand is : "+ford.brand);
        System.out.println(ford.color);
        System.out.println(ford.speed);
        System.out.println(ford.model);
        System.out.println(ford.price);

        Car kia = new Car(); // create an object in the memory
        kia.brand = "Kia";
        kia.speed = 100;
        kia.price = 45000;
        kia.color = "white";
        kia.horn();
        System.out.println(kia.currentCarSpeed());

        System.out.println("Car brand is : "+kia.brand);
        System.out.println(kia.color);
        System.out.println(kia.speed);
        System.out.println(kia.price);




    }


}
