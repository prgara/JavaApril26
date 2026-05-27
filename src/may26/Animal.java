package may26;

public class Animal {

    String name;


    public Animal(String name) {
        this.name = name;
    }


    void show(){
        System.out.println("nehfhejw");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Tommy");
        System.out.println(animal);
        animal.toString();

        String s = "Tommy";
        System.out.println(s.toString());
    }
}
