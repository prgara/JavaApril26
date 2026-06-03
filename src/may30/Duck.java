package may30;

public class Duck implements Flyable {
    @Override
    public void fly() {
        System.out.println("Dick can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
